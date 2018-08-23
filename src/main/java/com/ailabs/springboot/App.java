package com.ailabs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication = @ComponentScan组件扫描 + @Configuration配置  + @EnableAutoConfiguration自动配置
 * 项目启动方式   1.main方法  2.spring-boot:run 3.java -jar 包
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
