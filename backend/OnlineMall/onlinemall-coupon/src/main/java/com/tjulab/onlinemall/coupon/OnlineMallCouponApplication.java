package com.tjulab.onlinemall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlineMallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineMallCouponApplication.class, args);
    }

}
