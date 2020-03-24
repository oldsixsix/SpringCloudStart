package com.doubleStrong.springcloud;

import com.ribbon.rule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @auther zzyy
 * @create 2020-02-19 16:22
 * @RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
 * 定义要访问的服务，以及自定义的ribbon策略
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
public class OrderMain8010
{
    public static void main(String[] args) {
            SpringApplication.run(OrderMain8010.class, args);
    }
}
