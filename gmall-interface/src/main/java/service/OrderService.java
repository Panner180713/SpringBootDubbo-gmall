package service;

import entity.UserAddress;

import java.util.List;

/**
 * @Author chenshoukai
 * @Date 2020/10/19 19:56
 */
public interface OrderService {

    /**
     * @Description: 订单初始化
     * @Author: chenshoukai
     * @Date: 2020/10/19 19:57
     **/
    List<UserAddress> initOrder(String userId);
}
