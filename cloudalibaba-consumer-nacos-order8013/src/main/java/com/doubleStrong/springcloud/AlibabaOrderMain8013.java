package com.doubleStrong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Double strong
 * @date 2020/3/25 19:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaOrderMain8013 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaOrderMain8013.class,args) ;
    }
}
