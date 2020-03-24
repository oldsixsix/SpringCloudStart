package com.doubleStrong.cloud.service.impl;

import com.doubleStrong.cloud.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * @author Double strong
 * @date 2020/3/16 14:03
 */
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public String paymentInfo(Integer id) {
        return "OrderServiceImpl--paymentInfo--fallback";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "OrderServiceImpl--paymentInfo_TimeOut--fallback";
    }
}
