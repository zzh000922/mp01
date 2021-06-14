package com.atguigu.mp.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@MapperScan("com.atguigu.mp.mapper")
//@Configuration
public class MyBatisPlusConfig {

//    @Bean
//    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
//        return new OptimisticLockerInterceptor();
//    }
//
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
}
