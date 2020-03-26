package com.doubleStrong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Double strong
 * @date 2020/3/25 19:46
 */
@RestController
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    //实现配置和代码分离
    @Value("${service-url.nacos-user-service}")
    private String url;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        return  restTemplate.getForObject(url+"/payment/nacos/"+id,String.class);
    }

}
