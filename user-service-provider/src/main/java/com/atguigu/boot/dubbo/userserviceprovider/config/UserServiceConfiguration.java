package com.atguigu.boot.dubbo.userserviceprovider.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Springboot与dubbo整合的三种方式:
 * 1.导入boot-starter，在application.properties中配置相关属性，使用@Service暴露服务，使用@Reference调用服务。
 * 2.保留dubbo的xml文件，将application.properties中dubbo相关的配置全部删掉，在主配置类中使用@ImportResource导入dubbo的配置文件
 * 3.使用注解API的方式：将xml配置文件(或application.properties)中的每一个配置手动创建一个组件注入到容器中。
 * 以上三种方法，后两种可以精确到某一方法的配置，第一种只能精确到类。使用UserServiceConfiguration演示第三种整合方式，配置的内容与application.properties一一对应
 *
 */
@Configuration
public class UserServiceConfiguration {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("user-service-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

    @Bean
    public MonitorConfig monitorConfig(){
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        return monitorConfig;
    }
}
