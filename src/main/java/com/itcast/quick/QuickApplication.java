package com.itcast.quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * spring boot 内置tomcat插件http://localhost:8080没有tomcat返回页面
 * 创建的代码需要放在spring boot启动类的同级或子目录中
 */
@SpringBootApplication //spring启动类
public class QuickApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickApplication.class);//启动springboot工程
    }
}
