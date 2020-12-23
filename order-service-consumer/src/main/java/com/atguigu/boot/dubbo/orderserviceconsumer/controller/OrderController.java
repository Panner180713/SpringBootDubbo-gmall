package com.atguigu.boot.dubbo.orderserviceconsumer.controller;

import entity.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.List;

/**
 * @Author chenshoukai
 * @Date 2020/10/25 18:50
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(String userId){
        List<UserAddress> userAddressList = orderService.initOrder(userId);
        return userAddressList;
    }
}
