package com.blog.dusk;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.blog.dusk.mapper")
public class DuskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuskApplication.class, args);
	}
}
