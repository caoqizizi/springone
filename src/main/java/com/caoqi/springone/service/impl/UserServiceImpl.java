package com.caoqi.springone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caoqi.springone.dao.UserMapper;
import com.caoqi.springone.model.User;
import com.caoqi.springone.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
}
