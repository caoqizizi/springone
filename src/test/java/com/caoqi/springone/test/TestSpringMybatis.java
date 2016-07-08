package com.caoqi.springone.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.caoqi.springone.model.User;
import com.caoqi.springone.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestSpringMybatis {
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@Test
	public void test1() {
		User u = userService.getUserById(1L);
		System.out.println(u.getName());
	}
}
