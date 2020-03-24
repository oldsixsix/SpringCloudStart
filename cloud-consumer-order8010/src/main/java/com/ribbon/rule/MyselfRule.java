package com.ribbon.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Double strong
 * @date 2020/3/15 14:19
 * 自定义随机
 */

@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
//        负载策略采用随机方式
        return  new RandomRule();
    }
}
