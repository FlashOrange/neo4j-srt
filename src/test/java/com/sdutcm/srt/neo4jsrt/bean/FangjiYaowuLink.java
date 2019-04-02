package com.sdutcm.srt.neo4jsrt.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity("包括")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FangjiYaowuLink {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private FangjiNeo fangjiNeo;
    @EndNode
    private YaowuNeo yaowuNeo;
}
