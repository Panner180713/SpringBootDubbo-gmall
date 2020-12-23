package com.atguigu.boot.dubbo.orderserviceconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//开启基于注解的dubbo功能
@EnableDubbo
@SpringBootApplication
//@EnableHystrix
public class OrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsumerApplication.class, args);
    }

}
