package com.niewj.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nieweijun
 * @description
 * @copyright © 2022 niewj.com
 * @department 研发
 * @date 2022/9/29 14:13
 */
@SpringBootApplication
public class ConsumerWebApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerWebApp.class, args);
        System.out.println("=========consumer-started============");
    }
}
