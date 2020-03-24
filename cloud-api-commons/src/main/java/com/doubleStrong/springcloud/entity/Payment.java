package com.doubleStrong.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Double strong
 * @date 2020/3/13 14:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

        private Long id;
        private String serial;

}
