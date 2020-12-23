package com.atguigu.boot.dubbo.userserviceprovider.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties 将本类中所有属性和配置文件中x相关配置进行绑定
 * prefix = "student" 与配置文件中student关键字下面的所有属性进行一一映射
 * @Component 只有这个组件是容器中的组件才能使用@ConfigurationProperties的功能
 */
@Component
@ConfigurationProperties(prefix = "student")
public class Student {

    private String id;

    private String name;

    private String age;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
