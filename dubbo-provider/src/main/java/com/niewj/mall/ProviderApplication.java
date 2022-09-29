package com.niewj.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderApplication.class, args);

        System.out.println("======================started===========");
        System.in.read();
    }
}