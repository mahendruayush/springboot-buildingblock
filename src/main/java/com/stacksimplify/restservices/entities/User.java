package com.stacksimplify.restservices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity
@Entity
@Table(name="user1")
//@Table(name="user", schema="usermanagement") we will not use this because we are using H@ database which uses by default table schema)
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "USER_NAME", length=50, nullable=false, unique=true)
	private String username;
	
	@Column(name="FIRST_NAME", length=50, nullable=false, unique=true)
	private String firstname;
	
	@Column(name="LAST_NAME", length=50, nullable=false, unique=true)
	private String lastname;
	
	@Column(name="EMAIL_ADDRESS", length=50, nullable=false, unique=true)
	private String email;
	
	@Column(name="ROLE", length=50, nullable=false, unique=true)
	private String role;
	
	@Column(name="SSN", length=50, nullable=false, unique=true)
	private String ssn;

	//NO Argument Constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Field Constructor
	public User(Long id, String username, String firstname, String lastname, String email, String role, String ssn) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}

	
	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	//ToString - (Optional required for bean logging)
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
	
	
	
	
}
