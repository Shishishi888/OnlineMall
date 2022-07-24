package com.tjulab.onlinemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tjulab.onlinemall.product.dao")
@SpringBootApplication
public class OnlineMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMallProductApplication.class, args);
    }

}