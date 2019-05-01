package com.webcustomer.springhibernate.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull(message="This field must be completed")
	@Size(min=2,message="You need to enter more characters")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message="This field must be completed")
	@Size(min=2,message="You need to enter more characters")
	@Column(name="last_name")
	private String lastName;
	
	@NotNull(message="This field must be completed")
	@Size(min=2,message="You need to enter more characters")
	@Column(name="email")
	private String email;
	
	public Customer() {
		
	}
	
	public Customer(int id,String firstName, String lastName, String email) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
}
