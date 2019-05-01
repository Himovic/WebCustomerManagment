package com.webcustomer.springhibernate.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webcustomer.springhibernate.Models.Customer;
import com.webcustomer.springhibernate.Service.CustomerService;



@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	//method to show the list of all customers
	@RequestMapping(value="/list-customer")
	public String listCustomers(ModelMap model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("allCustomers",customers);
		return "list-customer";
	}
	
	//method to show add customer form
	@RequestMapping(value="/add-customer",method=RequestMethod.GET)
	public String showAddCustomerForm(ModelMap model) {
		model.put("customer", new Customer());
		return "addCustomer";
	}
	
	//method to confirme add customer form
	@RequestMapping(value="/confirm-add-customer",method=RequestMethod.POST)
	public String performAddCustomerForm(@Valid @ModelAttribute(name="customer") Customer customer,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "addCustomer";
		}else {
			customerService.addCustomer(customer);
			return "redirect:/list-customer";
		}
	}
	
	//method to delete a customer
	@RequestMapping(value="/delete-customer",method=RequestMethod.GET)
	public String DeleteCustomer(@RequestParam int id) {
		customerService.deleteCustomer(id);
		return "redirect:/list-customer";
	}
	
	//method to show a customer to update
	@RequestMapping(value="/update-customer",method=RequestMethod.GET)
	public String ShowInfoCustomer(@RequestParam int id,
			@ModelAttribute(name="customer")Customer customer,ModelMap model) {
		Customer customerInfo = customerService.getCustomer(id);
		model.put("customer",new Customer(id,customerInfo.getFirstName(),
				customerInfo.getLastName(),customerInfo.getEmail()));
		return "updateCustomer";
	}
	
	//method to confirm update customer
	@RequestMapping(value="/confirm-update-customer",method=RequestMethod.GET)
	public String confirmUpdateCustomer(@RequestParam int id, @Valid Customer customer,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "updateCustomer";
		}else {
			System.out.println("RUN : Customer ---->"+customer.toString());
			System.out.println("RUN : ID------>" + id);
			customerService.UpdateCustomer(customer);
			return "redirect:/list-customer";
		}
	}
}
