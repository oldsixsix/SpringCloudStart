package com.doubleStrong.springcloud.controller;

import com.doubleStrong.springcloud.entity.Payment;
import com.doubleStrong.springcloud.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @auther zzyy
 * @create 2020-02-19 16:24
 */
@RestController
@Slf4j
public class OrderConsulController
{

//    public static final String INVOKE_URL = "http://localhost:8001";
//    通过注册中心，传入服务名称
    public static  final  String Payment_Url="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/add")
    public R add(Payment payment)
    {
        return restTemplate.postForObject(Payment_Url+"/paymentService/add",payment,R.class);

    }
    @GetMapping(value = "/consumer/payment/get/{id}")
    public R<Payment> get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(Payment_Url+"/paymentService/getPaymentById/"+id,R.class);

    }
    @RequestMapping("/getServices")
    public ArrayList<Object> getAllServices(){
       return restTemplate.getForObject(Payment_Url+"/paymentService/discovery",ArrayList.class);
    }
}
