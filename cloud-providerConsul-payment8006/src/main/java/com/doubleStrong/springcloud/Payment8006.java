package com.doubleStrong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Double strong
 * @date 2020/3/15 11:16
 * @EnableDiscoveryClient
 * 都是能够让注册中心被发现，扫描到该服务。
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8006 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8006.class);
    }
}
