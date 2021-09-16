package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.UserDAO;
import com.customer.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userdao;
	
	public int saveUser(User user)
	{
		return this.userdao.saveUser(user);
	}

}
