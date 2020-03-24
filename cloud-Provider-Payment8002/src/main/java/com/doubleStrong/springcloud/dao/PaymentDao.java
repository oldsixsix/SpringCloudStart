package com.doubleStrong.springcloud.dao;

import com.doubleStrong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Double strong
 * @date 2020/3/13 15:00
 */
@Mapper
public interface PaymentDao {
//    这里写增删改查
        public int add(Payment payment);

        public Payment getPaymentById(Long id);
}
