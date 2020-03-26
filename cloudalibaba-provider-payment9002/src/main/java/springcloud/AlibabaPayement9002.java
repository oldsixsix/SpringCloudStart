package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Double strong
 * @date 2020/3/25 18:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPayement9002{
    public static void main(String[] args) {
        SpringApplication.run(AlibabaPayement9002.class,args);
    }
}
