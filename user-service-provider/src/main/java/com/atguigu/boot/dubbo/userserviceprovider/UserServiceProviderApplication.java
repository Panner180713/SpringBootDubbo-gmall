package com.atguigu.boot.dubbo.userserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Administrator
 */
@EnableDubbo//开启基于注解的dubbo功能
@SpringBootApplication
//@EnableHystrix//开启hystrix服务容错
public class UserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderApplication.class, args);
    }

}
