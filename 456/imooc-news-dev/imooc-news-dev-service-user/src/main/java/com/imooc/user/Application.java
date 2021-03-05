package com.imooc.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author:刘震
 * @Description:
 * @Date: Created in20:36 2021/3/3.
 * @Modified By:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.imooc.user.mapper")
@ComponentScan("com.imooc")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
