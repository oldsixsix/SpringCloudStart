package com.doubleStrong.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author Double strong
 * @date 2020/3/16 11:25
 */
@Service
public class PaymentService {
    /**
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfo(Integer id)
    {
        return "线程池："+Thread.currentThread().getName()+"  paymentInfo_OK,id:  "+id+"\t"+"哈哈哈";
    }

    /**
     * 有三秒延迟
     * @param id
     * @return
     * fallbackMethod 当自己出问题了，指定一个方法帮你解决 只要是当前服务出错或者超出自己的时间了，都可以由兜底服务进行
     *  @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")}
     *  规定线程执行该方法的时间上限为3s，超时则fallbackMethod
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")})
    public String paymentInfo_TimeOut(Integer id)
    {
        //方法执行异常也可以用服务降级来解决
//        int age = 10/0;
//        设置为5秒延迟 超时
        int timeNumber=3;
        try { TimeUnit.SECONDS.sleep(timeNumber); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:  "+Thread.currentThread().getName()+" id:  "+id+"\t"+"O(∩_∩)O哈哈~"+"  耗时3(秒): ";
    }

    /**
     *服务降级 ，超时的时候设置兜底方法
     * @param id
     * @return
     */
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池:  "+Thread.currentThread().getName()+" id:  "+id+"\t"+"系统繁忙~"+"超时兜底方法";
    }



    //服务熔断内容


    //=====服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        if(id < 0)
        {
            throw new RuntimeException("******id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+"调用成功，流水号: " + serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id)
    {
        return "id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " +id;
    }
}

