package com.sdutcm.srt.neo4jsrt.bean;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Table(name = "yaowus", schema = "knowledgeGraph", catalog = "")
public class YaowusEntity {
    private int id;
    private String yaoming;
    private String yiming;
    private String shiming;
    private String paozhi;
    private String yaoxing;
    private String gongnengzhuzhi;
    private String yongfayongliang;
    private String shiyongzhuyi;
    private Integer yaowujizaiCount;
    private Integer fangjiCount;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "yaoming")
    public String getYaoming() {
        return yaoming;
    }

    public void setYaoming(String yaoming) {
        this.yaoming = yaoming;
    }

    @Basic
    @Column(name = "yiming")
    public String getYiming() {
        return yiming;
    }

    public void setYiming(String yiming) {
        this.yiming = yiming;
    }

    @Basic
    @Column(name = "shiming")
    public String getShiming() {
        return shiming;
    }

    public void setShiming(String shiming) {
        this.shiming = shiming;
    }

    @Basic
    @Column(name = "paozhi")
    public String getPaozhi() {
        return paozhi;
    }

    public void setPaozhi(String paozhi) {
        this.paozhi = paozhi;
    }

    @Basic
    @Column(name = "yaoxing")
    public String getYaoxing() {
        return yaoxing;
    }

    public void setYaoxing(String yaoxing) {
        this.yaoxing = yaoxing;
    }

    @Basic
    @Column(name = "gongnengzhuzhi")
    public String getGongnengzhuzhi() {
        return gongnengzhuzhi;
    }

    public void setGongnengzhuzhi(String gongnengzhuzhi) {
        this.gongnengzhuzhi = gongnengzhuzhi;
    }

    @Basic
    @Column(name = "yongfayongliang")
    public String getYongfayongliang() {
        return yongfayongliang;
    }

    public void setYongfayongliang(String yongfayongliang) {
        this.yongfayongliang = yongfayongliang;
    }

    @Basic
    @Column(name = "shiyongzhuyi")
    public String getShiyongzhuyi() {
        return shiyongzhuyi;
    }

    public void setShiyongzhuyi(String shiyongzhuyi) {
        this.shiyongzhuyi = shiyongzhuyi;
    }

    @Basic
    @Column(name = "yaowujizai_count")
    public Integer getYaowujizaiCount() {
        return yaowujizaiCount;
    }

    public void setYaowujizaiCount(Integer yaowujizaiCount) {
        this.yaowujizaiCount = yaowujizaiCount;
    }

    @Basic
    @Column(name = "fangji_count")
    public Integer getFangjiCount() {
        return fangjiCount;
    }

    public void setFangjiCount(Integer fangjiCount) {
        this.fangjiCount = fangjiCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YaowusEntity that = (YaowusEntity) o;

        if (id != that.id) return false;
        if (yaoming != null ? !yaoming.equals(that.yaoming) : that.yaoming != null) return false;
        if (yiming != null ? !yiming.equals(that.yiming) : that.yiming != null) return false;
        if (shiming != null ? !shiming.equals(that.shiming) : that.shiming != null) return false;
        if (paozhi != null ? !paozhi.equals(that.paozhi) : that.paozhi != null) return false;
        if (yaoxing != null ? !yaoxing.equals(that.yaoxing) : that.yaoxing != null) return false;
        if (gongnengzhuzhi != null ? !gongnengzhuzhi.equals(that.gongnengzhuzhi) : that.gongnengzhuzhi != null)
            return false;
        if (yongfayongliang != null ? !yongfayongliang.equals(that.yongfayongliang) : that.yongfayongliang != null)
            return false;
        if (shiyongzhuyi != null ? !shiyongzhuyi.equals(that.shiyongzhuyi) : that.shiyongzhuyi != null) return false;
        if (yaowujizaiCount != null ? !yaowujizaiCount.equals(that.yaowujizaiCount) : that.yaowujizaiCount != null)
            return false;
        if (fangjiCount != null ? !fangjiCount.equals(that.fangjiCount) : that.fangjiCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (yaoming != null ? yaoming.hashCode() : 0);
        result = 31 * result + (yiming != null ? yiming.hashCode() : 0);
        result = 31 * result + (shiming != null ? shiming.hashCode() : 0);
        result = 31 * result + (paozhi != null ? paozhi.hashCode() : 0);
        result = 31 * result + (yaoxing != null ? yaoxing.hashCode() : 0);
        result = 31 * result + (gongnengzhuzhi != null ? gongnengzhuzhi.hashCode() : 0);
        result = 31 * result + (yongfayongliang != null ? yongfayongliang.hashCode() : 0);
        result = 31 * result + (shiyongzhuyi != null ? shiyongzhuyi.hashCode() : 0);
        result = 31 * result + (yaowujizaiCount != null ? yaowujizaiCount.hashCode() : 0);
        result = 31 * result + (fangjiCount != null ? fangjiCount.hashCode() : 0);
        return result;
    }
}
