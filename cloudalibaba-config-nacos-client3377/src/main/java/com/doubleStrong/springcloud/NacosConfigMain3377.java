package com.doubleStrong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Double strong
 * @date 2020/3/25 20:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain3377.class,args);
    }
}
