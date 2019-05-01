package com.webcustomer.springhibernate.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webcustomer.springhibernate.Models.User;
import com.webcustomer.springhibernate.Service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping("/access-denied")
	public String showExceptionHandlingPage() {
		return "access-denied";
	}
	
	@RequestMapping("/register-page")
	public String showRegisterPage(ModelMap model) {
		model.put("user", new User());
		return "register";
	}
	
	@RequestMapping("/registerTheUser")
	public String processRegistrationForm(@Valid @ModelAttribute(name="user")User user,BindingResult result) {
		if(result.hasErrors()) {
			return "register";
		}else {
			userService.RegisterUser(user);
			return "login";
		}
	}
}
