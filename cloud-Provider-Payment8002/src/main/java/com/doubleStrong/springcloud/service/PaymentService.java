package com.doubleStrong.springcloud.service;

import com.doubleStrong.springcloud.entity.Payment;

/**
 * @author Double strong
 * @date 2020/3/13 15:18
 */
public interface PaymentService {

    public int add(Payment payment);
    public Payment getPaymentById(Long id);

}
