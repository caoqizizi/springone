package com.caoqi.springone.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caoqi.springone.model.User;
import com.caoqi.springone.service.UserServiceI;

public class TestMybatis {
	private ApplicationContext ac;
	private UserServiceI userService;
	
	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext(new String[] {"classpath:spring.xml", "classpath:spring-mybatis.xml"});
		userService = (UserServiceI) ac.getBean("userService");
	}
	
	@Test
	public void test1(){
		User u = userService.getUserById(1L);
		System.out.println(u.getName());
	}
}
