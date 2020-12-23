package com.atguigu.boot.dubbo.userserviceprovider.entities;

import com.atguigu.boot.dubbo.userserviceprovider.factories.PropertySourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties 将本类中所有属性和配置文件中的相关配置进行绑定
 * prefix = "student" 与配置文件中student关键字下面的所有属性进行一一映射
 * @Component 只有这个组件是容器中的组件才能使用@ConfigurationProperties的功能
 *
 * 使用@Value注解也可以从配置文件中获取值。如果我们只是在某个业务逻辑中获取一下配置文件中的某个值，用@Value。
 * 如果我们专门编写了一个实体类来和配置文件进行映射，用@ConfigurationProperties
 *
 * @PropertySource 加载指定的配置文件，若不指定此配置，默认从全局配置文件(application.yml)中获取值
 */
@PropertySource(value = {"classpath:student.yml"}, factory = PropertySourceFactory.class)
@Component
@ConfigurationProperties(prefix = "student")
public class Student {

    private String id;

    private String name;

    private String age;

    @Value(value = "${createTime}")
    private String createTime;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
