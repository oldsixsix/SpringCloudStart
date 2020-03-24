package com.doubleStrong.springcloud.service;

import com.doubleStrong.springcloud.entity.Payment;
import com.doubleStrong.springcloud.entity.R;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Double strong
 * @date 2020/3/15 15:22
 */
@Component
@FeignClient(name="CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
        @GetMapping("/paymentService/getPaymentById/{id}")
        public R<Payment> getPaymentById(@PathVariable("id") Long id);

}
