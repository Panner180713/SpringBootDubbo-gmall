package entity;

import java.io.Serializable;

/**
 * @Author chenshoukai
 * @Date 2020/10/19 19:54
 * 实体类必须实现Serializable接口，因为dubbo生产者消费者之间传递数据时要进行序列化与反序列化
 */
public class UserAddress implements Serializable {
    private String id;

    private String userAddress;

    private String userId;

    private String phoneNum;

    public UserAddress(String id, String userAddress, String userId, String phoneNum) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.phoneNum = phoneNum;
    }

    public UserAddress() {
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id='" + id + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userId='" + userId + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
