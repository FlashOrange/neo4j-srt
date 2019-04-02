package com.sdutcm.srt.neo4jsrt.dao;

import com.sdutcm.srt.neo4jsrt.bean.FangjisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FangjiDaoMysql extends JpaRepository<FangjisEntity,Integer> {
}
