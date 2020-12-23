package service.stub;

import entity.UserAddress;
import org.springframework.util.StringUtils;
import service.UserService;

import java.util.List;

/**
 * UserService的本地存根
 * @Author chenshoukai
 * @Date 2020/11/07 20:59
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * dubbo会自动传入UserService的远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressByUserId(String userId) {
        System.out.println("UserService的本地存根被调用了...");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressByUserId(userId);
        }
        return null;
    }
}
