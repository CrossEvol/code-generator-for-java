package com.crossevol.demo.mybatiscodegenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.crossevol.demo.mybatiscodegenerator.mapper"})
public class MybatisCodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisCodeGeneratorApplication.class, args);
    }

}
