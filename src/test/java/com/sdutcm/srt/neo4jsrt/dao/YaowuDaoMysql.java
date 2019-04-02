package com.sdutcm.srt.neo4jsrt.dao;

import com.sdutcm.srt.neo4jsrt.bean.YaowusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YaowuDaoMysql extends JpaRepository<YaowusEntity,Integer> {
}
