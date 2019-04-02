package com.sdutcm.srt.neo4jsrt.dao;

import com.sdutcm.srt.neo4jsrt.bean.FangjiNeo;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FangjiDaoNeo extends Neo4jRepository<FangjiNeo, Long> {
    int countByNameEquals(String name);

    FangjiNeo findFirstByNameEquals(String name);
}
