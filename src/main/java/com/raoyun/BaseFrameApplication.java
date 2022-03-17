package com.raoyun;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.raoyun.mapper"})
@SpringBootApplication
public class BaseFrameApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseFrameApplication.class, args);
    }

}
