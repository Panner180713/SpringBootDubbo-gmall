package service;

import entity.UserAddress;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author chenshoukai
 * @Date 2020/10/19 19:55
 */
public interface UserService {

    /**
     * @Description: 根据userId获取用户地址列表
     * @Author: chenshoukai
     * @Date: 2020/10/19 19:56
     **/
    List<UserAddress> getUserAddressByUserId(String userId);
}
