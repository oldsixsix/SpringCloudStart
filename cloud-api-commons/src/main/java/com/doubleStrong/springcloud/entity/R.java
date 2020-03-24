package com.doubleStrong.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Double strong
 * @date 2020/3/13 14:56
 * <T> 装的什么返回什么
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class R<T> {
//    404 Not Found
    private  Integer code;
    private  String  message;
    private  T data;
//    定义两个参数的构造方法
    public R(Integer code,String message)
    {
//        调用全部参数的构造方法
        this(code,message,null);
    }

}
