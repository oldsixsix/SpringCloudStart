package com.doubleStrong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Double strong
 * @date 2020/3/14 12:17
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain9001.class,args);
    }
}
