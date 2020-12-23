package com.atguigu.boot.dubbo.userserviceprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import entity.UserAddress;
import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author chenshoukai
 * @Date 2020/10/19 19:57
 */
@Service(version = "2.0.0")
@Component
public class UserServiceImplPro implements UserService {

    @Override
    public List<UserAddress> getUserAddressByUserId(String userId) {
        System.out.println("调用了新版本...");
        UserAddress userAddress1 = new UserAddress("01","山东威海","0001","17853146438");
        UserAddress userAddress2 = new UserAddress("02","山东烟台","0001","17853146438");
        return Arrays.asList(userAddress1,userAddress2);
    }
}
