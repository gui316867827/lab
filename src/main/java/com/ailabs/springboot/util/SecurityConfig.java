//package com.ailabs.springboot.util;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Profile("production") //设置只在生产环境中生效
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//	private final Log logger = LogFactory.getLog(SecurityConfig.class);
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		logger.debug("Using @Override configure(HttpSecurity). If subclassed this will potentially override subclass configure(HttpSecurity).");
//
//		http
//			.authorizeRequests()
//				.antMatchers("/").access("hasRole('READER')")
//				.antMatchers("/**").permitAll()
//			.and()
//			.formLogin().and()
//			.httpBasic();
//	}
//}
