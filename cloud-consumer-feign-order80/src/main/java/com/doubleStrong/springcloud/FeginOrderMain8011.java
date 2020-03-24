package com.doubleStrong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Double strong
 * @date 2020/3/15 15:18
 * @EnableFeignClients 该工程是以fegin作为微服务调用接口的客户端
 */
@SpringBootApplication
@EnableFeignClients
public class FeginOrderMain8011 {
    public static void main(String[] args) {
        SpringApplication.run(FeginOrderMain8011.class,args);
    }
}
