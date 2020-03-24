package com.doubleStrong.cloud.controller;

import com.doubleStrong.cloud.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Double strong
 * @date 2020/3/16 12:33
 * @DefaultProperties(defaultFallback = "") 配置一个全局的服务降级方法
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "paymentGlobal")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){
        return orderService.paymentInfo(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
   /* @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")})*/
//    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return orderService.paymentInfo_TimeOut(id);
    }

    public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id){
        return "我是消费者80，对方支付系统繁忙请10秒钟再试";
    }

    /**
     * 这里不能有参数
     * 应当适用所有服务调用发放的错误调用，因此此种方式默认调用空参FallBack方法，所以改FallBack方法的参数列表为空参即可：
     * @return
     */
    public String paymentGlobal(){
//        必须是空参
        return "我是全局fallback";
    }
}
