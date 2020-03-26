package com.doubleStrong.springcloud.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Double strong
 * @date 2020/3/25 13:39
 */
@RestController
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }

}
