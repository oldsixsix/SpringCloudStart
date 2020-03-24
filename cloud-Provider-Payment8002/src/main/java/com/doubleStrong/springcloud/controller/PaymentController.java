package com.doubleStrong.springcloud.controller;

import com.doubleStrong.springcloud.entity.Payment;
import com.doubleStrong.springcloud.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import com.doubleStrong.springcloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Double strong
 * @date 2020/3/13 15:23
 */
@RestController
@CrossOrigin
@RequestMapping("/paymentService")
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;


    @PostMapping("/add")
    public R add(@RequestBody Payment payment){
        int result = paymentService.add(payment);
        log.info("插入结构"+result);
        if(result>0)
        {
            return new R(200,"插入成功 端口号："+serverPort,result);
        }
        else
        {
            return new R(201,"error",null);
        }

    }

    @RequestMapping("/getPaymentById/{id}")
    public R<Payment> getPaymentById(@PathVariable("id")Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        if(paymentById!=null)
        {
            System.out.println("啊哈哈哈");
            return new R(200,"查询成功端口号: "+serverPort,paymentById);
        }
        else {
            return new R(201,"error",null);
        }

    }

    @GetMapping("/discovery")
    public Object dicovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        return services;
    }


}
