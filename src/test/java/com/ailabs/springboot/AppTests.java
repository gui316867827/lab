package com.ailabs.springboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.MockMvcConfigurer;
import org.springframework.web.context.WebApplicationContext;

// 默认的单元测试注解@RunWith(SpringRunner.class) @SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration // @ContextConfiguration 加载spring应用程序上下文有局限性
@WebAppConfiguration // 开启Web上下文测试
//@WebIntegrationTest //用作@IntegrationTest和@WebAppConfiguration的替代
public class AppTests {

	@Test
	public void contextLoads() {
		System.out.println("eeeeee");
	}
	
	/**
	 * MockMvc
	 */
	@Autowired
	private WebApplicationContext webContext;
	private MockMvc mockMvc;// 能在一个近似真实的模拟servlet容器里测试控制器，而不启动应用服务器
	@Before
	public void serUpMockMvc(){
		mockMvc = MockMvcBuilders
				.webAppContextSetup(webContext)
				//.apply(SecurityMockMvcConfigureers.springSecurty())
				.build();// 产生一个mockMvc实例对象
	}

	/**
	 * Selenium 功能不止请求和获取结果，还能打开浏览器，在浏览器上下文中执行测试，可以重复性的自动测试
	 */
	//private static FirefoxDriver brower;
}
