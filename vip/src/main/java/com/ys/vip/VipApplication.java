package com.ys.vip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ys.vip.mapper")
public class VipApplication {
    public static void main(String[] args) {
        SpringApplication.run(VipApplication.class, args);
    }
}
