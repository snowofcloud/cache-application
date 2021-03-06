package com.bob;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.bob.dao")
public class CacheApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CacheApp.class, args);
    }
}
