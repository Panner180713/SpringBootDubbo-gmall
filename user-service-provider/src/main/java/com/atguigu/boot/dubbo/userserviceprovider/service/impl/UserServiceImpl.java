package com.atguigu.boot.dubbo.userserviceprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import entity.UserAddress;
import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Service的weight属性可设置服务的权重
 * @Author chenshoukai
 * @Date 2020/10/19 19:57
 */
@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

//    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressByUserId(String userId) {
        System.out.println("调用了旧版本...");
        UserAddress userAddress1 = new UserAddress("01","山东济南","0001","17853146438");
        UserAddress userAddress2 = new UserAddress("02","山东青岛","0001","17853146438");
        if(Math.random() > 0.5){
            throw new RuntimeException("hystrix异常测试");
        }
        return Arrays.asList(userAddress1,userAddress2);
    }
}
