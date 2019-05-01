package com.webcustomer.springhibernate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcustomer.springhibernate.DAO.UserDAO;
import com.webcustomer.springhibernate.Models.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;
	
	@Override
	public void RegisterUser(User user) {
		userDao.RegisterUser(user);
	}

}
