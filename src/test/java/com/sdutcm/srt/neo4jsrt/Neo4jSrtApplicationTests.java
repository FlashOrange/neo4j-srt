package com.sdutcm.srt.neo4jsrt;

import com.sdutcm.srt.neo4jsrt.bean.FangjiNeo;
import com.sdutcm.srt.neo4jsrt.bean.FangjiYaowuLink;
import com.sdutcm.srt.neo4jsrt.bean.FangjiZuchengEntity;
import com.sdutcm.srt.neo4jsrt.bean.YaowuNeo;
import com.sdutcm.srt.neo4jsrt.dao.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Neo4jSrtApplicationTests {

    @Autowired
    private YaowuDaoMysql yaowuDaoMysql;
    @Autowired
    private FangjiZuchengDaoMysql fangjiZuchengDaoMysql;
    @Autowired
    private FangjiDaoMysql fangjiDaoMysql;
    @Autowired
    private YaowuDaoNeo yaowuDaoNeo;
    @Autowired
    private FangjiDaoNeo fangjiDaoNeo;
    @Autowired
    private FangjiYaowuLinkDaoNeo fangjiYaowuLinkDaoNeo;

    @Test
    public void contextLoads() {

    }

    @Test
    public void insertFangjiNodeToNeo() {
        fangjiZuchengDaoMysql.findAll().parallelStream().forEach(item -> {
            String fangjiName = item.getFangji();
            if (fangjiDaoNeo.countByNameEquals(fangjiName) == 0) {
                FangjiNeo fangjiNeo = new FangjiNeo();
                fangjiNeo.setName(fangjiName);
                fangjiDaoNeo.save(fangjiNeo);
            }
        });
    }

    @Test
    /*
      插入节点
     */
    public void insertZhongyaoNodeToNeo() {
        fangjiZuchengDaoMysql.findAll().parallelStream().forEach(item -> {
            String zhongyaoName = item.getZhongyao();
            if (yaowuDaoNeo.countByNameEquals(zhongyaoName) == 0) {
                YaowuNeo yaowuNeo = new YaowuNeo();
                yaowuNeo.setName(zhongyaoName);
                yaowuDaoNeo.save(yaowuNeo);
            }
        });
    }

    @Test
    /*
      插入联系
     */
    public void insertLinkToNeo() {
        AtomicInteger i = new AtomicInteger();//计数器

        for (FangjiZuchengEntity item : fangjiZuchengDaoMysql.findAll()) {//到数据库中查出所有的方剂中药关系
            //获取中药名称
            String itemZhongyao = item.getZhongyao();
            //方剂方剂名称
            String itemFangji = item.getFangji();

            //定义neo4j节点初值
            YaowuNeo yaowuDaoNeoFirstByNameEquals;
            FangjiNeo fangjiDaoNeoFirstByNameEquals;

            try {
                //查找neo4j中的对应节点
                yaowuDaoNeoFirstByNameEquals = yaowuDaoNeo.findFirstByNameEquals(itemZhongyao);//中药
                fangjiDaoNeoFirstByNameEquals = fangjiDaoNeo.findFirstByNameEquals(itemFangji);//方剂
                System.out.println(i + "：" + itemFangji + "====>" + itemZhongyao);
                //插入联系
                fangjiYaowuLinkDaoNeo.save(
                        new FangjiYaowuLink(null, fangjiDaoNeoFirstByNameEquals, yaowuDaoNeoFirstByNameEquals));
                i.getAndIncrement();
            } catch (Exception e) {
                continue;
            }
        }

//        fangjiZuchengDaoMysql.findAll().parallelStream().forEach(item -> {
//            String itemZhongyao = item.getZhongyao();
//            String itemFangji = item.getFangji();
//            YaowuNeo yaowuDaoNeoFirstByNameEquals = yaowuDaoNeo.findFirstByNameEquals(itemZhongyao);
//            FangjiNeo fangjiDaoNeoFirstByNameEquals = fangjiDaoNeo.findFirstByNameEquals(itemFangji);
//            System.out.println(i + "：" + itemFangji + "====>" + itemZhongyao);
//            fangjiYaowuLinkDaoNeo.save(
//                    new FangjiYaowuLink(null, fangjiDaoNeoFirstByNameEquals, yaowuDaoNeoFirstByNameEquals));
//            i.getAndIncrement();
//        });
    }
}
