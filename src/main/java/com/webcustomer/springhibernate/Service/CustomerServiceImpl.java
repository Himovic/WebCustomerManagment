package com.webcustomer.springhibernate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcustomer.springhibernate.DAO.CustomerDAO;
import com.webcustomer.springhibernate.Models.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;
	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customer);
	}
	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(id);
	}
	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(id);
	}
	@Override
	public void UpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.UpdateCustomer(customer);
	}

}
