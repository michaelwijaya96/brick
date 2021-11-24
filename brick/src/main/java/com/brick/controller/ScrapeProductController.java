package com.brick.controller;

import com.brick.dto.ScrapeProductResponse;
import com.brick.service.ScrapeProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Michael Wijaya
 * @version $Id: ScrapeProductController.java, v0.1 Nov 24, 2021 10:17 AM Michael Wijaya Exp $
 */
@RestController
@Slf4j
@RequestMapping("/scrape/product")
public class ScrapeProductController {

    @Autowired
    private ScrapeProductService scrapeProductService;

    @GetMapping
    public List<ScrapeProductResponse> queryProduct(){
        return scrapeProductService.queryProduct();
    }

}
