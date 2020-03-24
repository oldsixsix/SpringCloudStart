package com.doubleStrong.cloud.service;

import com.doubleStrong.cloud.service.impl.OrderServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Double strong
 * @date 2020/3/16 12:34
 */
@Service
@FeignClient(name="CLOUD-PROVIDER-HYSTRIX-PAYMENT-8012",fallback = OrderServiceImpl.class)
public interface OrderService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo(@PathVariable("id")Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id")Integer id);
}
