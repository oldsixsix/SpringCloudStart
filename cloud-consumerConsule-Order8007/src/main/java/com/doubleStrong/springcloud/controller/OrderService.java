package com.doubleStrong.springcloud.controller;

import com.doubleStrong.springcloud.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Double strong
 * @date 2020/3/15 11:58
 */
@RestController
@Slf4j
public class OrderService {

    @Resource
    private RestTemplate restTemplate;
    private static final String ServiceUrl="http://consul-provider-payment";

    @GetMapping("/consumer/order/consul")
    public String ConsumerOrder(){
      return   restTemplate.getForObject(ServiceUrl+"/payment/zk",String.class);

    }
}
