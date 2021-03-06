package com.webcustomer.springhibernate.DAO;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webcustomer.springhibernate.Models.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void RegisterUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

}
