

package com.sdutcm.srt.neo4jsrt.bean;

import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@ToString
@Table(name = "fangjis", schema = "knowledgeGraph", catalog = "")
public class FangjisEntity {
    private int id;
    private String fangming;
    private String laiyuan;
    private Integer gujishumuId;
    private String shuming;
    private String juanci;
    private String jixing;
    private String zucheng;
    private String yongfa;
    private String gongxiao;
    private String zhuzhi;
    private String jinji;
    private String xiangguanyanjiu;
    private String leibie;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fangming")
    public String getFangming() {
        return fangming;
    }

    public void setFangming(String fangming) {
        this.fangming = fangming;
    }

    @Basic
    @Column(name = "laiyuan")
    public String getLaiyuan() {
        return laiyuan;
    }

    public void setLaiyuan(String laiyuan) {
        this.laiyuan = laiyuan;
    }

    @Basic
    @Column(name = "gujishumu_id")
    public Integer getGujishumuId() {
        return gujishumuId;
    }

    public void setGujishumuId(Integer gujishumuId) {
        this.gujishumuId = gujishumuId;
    }

    @Basic
    @Column(name = "shuming")
    public String getShuming() {
        return shuming;
    }

    public void setShuming(String shuming) {
        this.shuming = shuming;
    }

    @Basic
    @Column(name = "juanci")
    public String getJuanci() {
        return juanci;
    }

    public void setJuanci(String juanci) {
        this.juanci = juanci;
    }

    @Basic
    @Column(name = "jixing")
    public String getJixing() {
        return jixing;
    }

    public void setJixing(String jixing) {
        this.jixing = jixing;
    }

    @Basic
    @Column(name = "zucheng")
    public String getZucheng() {
        return zucheng;
    }

    public void setZucheng(String zucheng) {
        this.zucheng = zucheng;
    }

    @Basic
    @Column(name = "yongfa")
    public String getYongfa() {
        return yongfa;
    }

    public void setYongfa(String yongfa) {
        this.yongfa = yongfa;
    }

    @Basic
    @Column(name = "gongxiao")
    public String getGongxiao() {
        return gongxiao;
    }

    public void setGongxiao(String gongxiao) {
        this.gongxiao = gongxiao;
    }

    @Basic
    @Column(name = "zhuzhi")
    public String getZhuzhi() {
        return zhuzhi;
    }

    public void setZhuzhi(String zhuzhi) {
        this.zhuzhi = zhuzhi;
    }

    @Basic
    @Column(name = "jinji")
    public String getJinji() {
        return jinji;
    }

    public void setJinji(String jinji) {
        this.jinji = jinji;
    }

    @Basic
    @Column(name = "xiangguanyanjiu")
    public String getXiangguanyanjiu() {
        return xiangguanyanjiu;
    }

    public void setXiangguanyanjiu(String xiangguanyanjiu) {
        this.xiangguanyanjiu = xiangguanyanjiu;
    }

    @Basic
    @Column(name = "leibie")
    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FangjisEntity that = (FangjisEntity) o;

        if (id != that.id) return false;
        if (fangming != null ? !fangming.equals(that.fangming) : that.fangming != null) return false;
        if (laiyuan != null ? !laiyuan.equals(that.laiyuan) : that.laiyuan != null) return false;
        if (gujishumuId != null ? !gujishumuId.equals(that.gujishumuId) : that.gujishumuId != null) return false;
        if (shuming != null ? !shuming.equals(that.shuming) : that.shuming != null) return false;
        if (juanci != null ? !juanci.equals(that.juanci) : that.juanci != null) return false;
        if (jixing != null ? !jixing.equals(that.jixing) : that.jixing != null) return false;
        if (zucheng != null ? !zucheng.equals(that.zucheng) : that.zucheng != null) return false;
        if (yongfa != null ? !yongfa.equals(that.yongfa) : that.yongfa != null) return false;
        if (gongxiao != null ? !gongxiao.equals(that.gongxiao) : that.gongxiao != null) return false;
        if (zhuzhi != null ? !zhuzhi.equals(that.zhuzhi) : that.zhuzhi != null) return false;
        if (jinji != null ? !jinji.equals(that.jinji) : that.jinji != null) return false;
        if (xiangguanyanjiu != null ? !xiangguanyanjiu.equals(that.xiangguanyanjiu) : that.xiangguanyanjiu != null)
            return false;
        if (leibie != null ? !leibie.equals(that.leibie) : that.leibie != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fangming != null ? fangming.hashCode() : 0);
        result = 31 * result + (laiyuan != null ? laiyuan.hashCode() : 0);
        result = 31 * result + (gujishumuId != null ? gujishumuId.hashCode() : 0);
        result = 31 * result + (shuming != null ? shuming.hashCode() : 0);
        result = 31 * result + (juanci != null ? juanci.hashCode() : 0);
        result = 31 * result + (jixing != null ? jixing.hashCode() : 0);
        result = 31 * result + (zucheng != null ? zucheng.hashCode() : 0);
        result = 31 * result + (yongfa != null ? yongfa.hashCode() : 0);
        result = 31 * result + (gongxiao != null ? gongxiao.hashCode() : 0);
        result = 31 * result + (zhuzhi != null ? zhuzhi.hashCode() : 0);
        result = 31 * result + (jinji != null ? jinji.hashCode() : 0);
        result = 31 * result + (xiangguanyanjiu != null ? xiangguanyanjiu.hashCode() : 0);
        result = 31 * result + (leibie != null ? leibie.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
