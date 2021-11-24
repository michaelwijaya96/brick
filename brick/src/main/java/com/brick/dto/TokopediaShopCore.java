package com.brick.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Michael Wijaya
 * @version $Id: TokopediaShopCore.java, v0.1 Nov 24, 2021 4:51 PM Michael Wijaya Exp $
 */
@Data
@Accessors
public class TokopediaShopCore {
    private int defaultSort;
    private String description;
    private String domain;
    private String name;
    private String shopID;
    private String tagLine;
}
