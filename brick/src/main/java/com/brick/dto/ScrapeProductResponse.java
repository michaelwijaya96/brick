package com.brick.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Michael Wijaya
 * @version $Id: ScrapeProductResponse.java, v0.1 Nov 24, 2021 10:19 AM Michael Wijaya Exp $
 */
@Data
@Accessors
public class ScrapeProductResponse {

    private String productName;
    private String description;
    private String imageLink;
    private String price;
    private String rating;
    private String merchantName;
}
