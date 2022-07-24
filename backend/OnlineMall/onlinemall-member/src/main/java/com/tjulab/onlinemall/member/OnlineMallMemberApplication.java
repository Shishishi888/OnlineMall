package com.tjulab.onlinemall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlineMallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMallMemberApplication.class, args);
    }

}
