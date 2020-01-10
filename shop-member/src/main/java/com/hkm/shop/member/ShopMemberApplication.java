package com.hkm.shop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hkm.shop.member.mapper")
public class ShopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopMemberApplication.class, args);
    }

}
