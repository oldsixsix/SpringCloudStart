package com.doubleStrong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Double strong
 * @date 2020/3/15 11:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain8007 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8007.class,args);
    }
}
