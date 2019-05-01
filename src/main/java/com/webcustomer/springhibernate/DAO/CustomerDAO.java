package com.webcustomer.springhibernate.DAO;

import java.util.List;

import com.webcustomer.springhibernate.Models.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	public void addCustomer(Customer customer);
	public void deleteCustomer(int id);
	public Customer getCustomer(int id);
	public void UpdateCustomer(Customer customer);
}
