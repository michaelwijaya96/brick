package com.brick.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Michael Wijaya
 * @version $Id: TokopediaData.java, v0.1 Nov 24, 2021 10:35 AM Michael Wijaya Exp $
 */
@Data
@Accessors
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TokopediaData {
    private String imageUrlDesktop;
    private String imageUrlMobile;
    private String name;
    private String price;
    private String ratingAverage;
    private String shopUrlDesktop;
}
