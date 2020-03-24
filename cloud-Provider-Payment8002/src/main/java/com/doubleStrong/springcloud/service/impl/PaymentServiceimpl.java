package com.doubleStrong.springcloud.service.impl;


import com.doubleStrong.springcloud.entity.Payment;
import org.springframework.stereotype.Service;
import com.doubleStrong.springcloud.dao.PaymentDao;
import com.doubleStrong.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author Double strong
 * @date 2020/3/13 15:18
 */
@Service
public class PaymentServiceimpl implements PaymentService {

    @Resource
    private PaymentDao paymentdao;

    public int add(Payment payment)
    {
        int add = paymentdao.add(payment);
        return add;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment paymentById = paymentdao.getPaymentById(id);
        return paymentById;
    }


}
