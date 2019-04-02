package com.sdutcm.srt.neo4jsrt.dao;

import com.sdutcm.srt.neo4jsrt.bean.YaowuNeo;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface YaowuDaoNeo extends Neo4jRepository<YaowuNeo, Long> {
    int countByNameEquals(String name);

    YaowuNeo findFirstByNameEquals(String name);
}
