package com.atguigu.boot.dubbo.orderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import entity.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.OrderService;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author chenshoukai
 * @Date 2020/10/19 20:00
 */
@Component
public class OrderServiceImpl implements OrderService {

//    @Autowired
    /**
     * retries:重试次数，不包含第一次调用。默认值0，代表不重试。
     * 如果有多个服务提供者，会尝试分别调用。
     * 重试操作一般用在幂等操作(执行一次与执行多次产生的效果相同，如查询操作)上，非幂等操作(如新增操作)不设置重试。
     * timeout:超时时间
     * version:当服务提供者有多个版本时，可通过此属性调用想要的版本，当值为*时，随机调用各个版本。
     * url:dubbo直连，值为服务提供者的ip和暴露服务的端口。采用dubbo直连的方式，在没有注册中心的情况下依然能够调用服务
     */
    @Reference(retries = 3,timeout = 3000,version = "*",stub = "service.stub.UserServiceStub")
    private UserService userService;

//    @HystrixCommand(fallbackMethod = "fallbackMethod")
    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressByUserId(userId);
        return userAddressList;
    }

    public List<UserAddress> fallbackMethod() {
        System.out.println("hystrix回调方法调用了...");
        UserAddress userAddress1 = new UserAddress("03","测试地址","测试","测试");
        return Arrays.asList(userAddress1);
    }
}
