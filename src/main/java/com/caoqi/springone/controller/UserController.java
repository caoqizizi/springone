package com.caoqi.springone.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caoqi.springone.model.User;
import com.caoqi.springone.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	private UserServiceI userService;
	
	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@RequestMapping("/showUser")
	// http://127.0.0.1:8080/springone/userController/showUser.do
	public String showUser1(Long id, HttpServletRequest request) {
		User u = (User)userService.getUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}
	
	@RequestMapping("/showUser/{id}")
	// http://127.0.0.1:8080/springone/userController/showUser.do
	public String showUser2(@PathVariable Long id, HttpServletRequest request) {
		User u = (User)userService.getUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}
	
}
