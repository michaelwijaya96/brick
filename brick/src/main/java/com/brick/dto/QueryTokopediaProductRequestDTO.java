package com.brick.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Michael Wijaya
 * @version $Id: QueryTokopediaProduct.java, v0.1 Nov 24, 2021 10:12 AM Michael Wijaya Exp $
 */

@Data
@Accessors
public class QueryTokopediaProductRequestDTO {
    private String operationName;
    private Variable variables;
    private String query ;

    @Data
    @Accessors
    public static class Variable {
        private Integer id;
        private String device;
        private String identifier;
        private String componentId;
        private String filters;
        private String domain;
    }
}
