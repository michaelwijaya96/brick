package com.brick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Michael Wijaya
 * @version $Id: Application.java, v0.1 Nov 23, 2021 4:53 PM Michael Wijaya Exp $
 */
@SpringBootApplication(scanBasePackages = {"com.brick"})
@EnableFeignClients(basePackages = {"com.brick.proxy"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
