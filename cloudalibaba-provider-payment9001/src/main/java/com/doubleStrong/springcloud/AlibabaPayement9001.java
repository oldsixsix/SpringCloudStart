package com.doubleStrong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.invoke.convert.ConversionServiceParameterValueMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Double strong
 * @date 2020/3/25 18:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPayement9001 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaPayement9001.class,args);
    }
}
