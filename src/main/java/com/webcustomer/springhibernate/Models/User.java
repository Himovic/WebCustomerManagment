package com.webcustomer.springhibernate.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="firstname")
	@javax.validation.constraints.NotEmpty(message="This field must not be blank")
	@Size(min=4,message="You have to enter more then 4 characters")
	private String firstname;
	
	@Column(name="lastname")
	@javax.validation.constraints.NotEmpty(message="This field must not be blank")
	@Size(min=4,message="You have to enter more then 4 characters")
	private String lastname;
	
	@Column(name="email")
	@javax.validation.constraints.NotEmpty(message="This field must not be blank")
	private String email;
	
	@Column(name="username")
	@javax.validation.constraints.NotEmpty(message="This field must not be blank")
	@Size(min=4,message="You have to enter more then 4 characters")
	private String username;
	
	@Column(name="password")
	@javax.validation.constraints.NotEmpty(message="This field must not be blank")
	@Size(min=8,message="Your password must containe at least 8 characters")
	private String password;
	
	@Column(name="role")
	private String role;
	
	public User() {
		
	}
	
	public User(String firstname,String lastname,String email,String username,String password,String role) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.username=username;
		this.password=password;
		this.role=role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", role= "+role+"]";
	}
	
	
}
