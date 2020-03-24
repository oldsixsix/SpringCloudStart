package com.doubleStrong.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Double strong
 * @date 2020/3/16 10:47
 */
@Configuration
public class FeignConfig {

    /**
     * 配置日志级别
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
