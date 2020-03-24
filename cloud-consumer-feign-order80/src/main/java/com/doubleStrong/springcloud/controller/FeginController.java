package com.doubleStrong.springcloud.controller;

import com.doubleStrong.springcloud.entity.Payment;
import com.doubleStrong.springcloud.entity.R;
import com.doubleStrong.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Double strong
 * @date 2020/3/15 15:21
 */
@RestController
@Slf4j
public class FeginController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/payment/get/{id}")
    public R<Payment> getPayment(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
