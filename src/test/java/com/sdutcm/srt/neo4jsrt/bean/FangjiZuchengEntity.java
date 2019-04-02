package com.sdutcm.srt.neo4jsrt.bean;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Table(name = "fangji_zucheng", schema = "knowledgeGraph", catalog = "")
public class FangjiZuchengEntity {
    private int id;
    private String fangji;
    private String zhongyao;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fangji")
    public String getFangji() {
        return fangji;
    }

    public void setFangji(String fangji) {
        this.fangji = fangji;
    }

    @Basic
    @Column(name = "zhongyao")
    public String getZhongyao() {
        return zhongyao;
    }

    public void setZhongyao(String zhongyao) {
        this.zhongyao = zhongyao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FangjiZuchengEntity that = (FangjiZuchengEntity) o;

        if (id != that.id) return false;
        if (fangji != null ? !fangji.equals(that.fangji) : that.fangji != null) return false;
        if (zhongyao != null ? !zhongyao.equals(that.zhongyao) : that.zhongyao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fangji != null ? fangji.hashCode() : 0);
        result = 31 * result + (zhongyao != null ? zhongyao.hashCode() : 0);
        return result;
    }
}
