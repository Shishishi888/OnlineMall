package com.tjulab.onlinemall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.tjulab.onlinemall.member.feign")
public class OnlineMallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMallMemberApplication.class, args);
    }

}
