package com.doubleStrong.springcloud.controller;

import com.doubleStrong.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Double strong
 * @date 2020/3/16 12:18
 */
@RestController
@Slf4j
public class PaymentController  {
    @Resource
    private PaymentService paymentService;


    /**
     * 正常访问
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo(Integer id)
    {
        return paymentService.paymentInfo(id);
    }

    /**
     * 有三秒延迟
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(Integer id)
    {
     return   paymentService.paymentInfo_TimeOut(id);
    }

//    服务熔断测试接口
@GetMapping("/payment/hystrix/breaker/{id}")
public String paymentInfo_Breaker(@PathVariable("id") Integer id)
{
    System.out.println(id);
    return   paymentService.paymentCircuitBreaker(id);
}

    @GetMapping("/payment/get/{id}")
    public String GateWayTest(@PathVariable("id") Integer id)
    {
        System.out.println(id);
        return "ok";
    }


}
