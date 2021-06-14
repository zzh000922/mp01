package com.atguigu.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.mp.mapper")
@SpringBootApplication
public class Mp01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mp01Application.class, args);
    }

}
