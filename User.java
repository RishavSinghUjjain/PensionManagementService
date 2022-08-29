package com.pension.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="puser")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="u_password")
	private Long password;
	
	@Column(name="u_name")
	private String name;
	
	@Column(name="u_address")
	private String address;
	
	@Column(name="u_emailId")
	private String emailId;
	
	@Column(name="u_role")
	private String role;
	
	@Column(name="u_mobile")
	private Long mobile;
	
	@Column(name="u_type")
	private String uType;
	
	public User() {
		
	}
	
	public User(Long id, Long password ,String name, String address, String emailId, String role, Long mobile, String uType) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.emailId = emailId;
		this.role = role;
		this.mobile = mobile;
		this.uType = uType;
	}

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getuType() {
		return uType;
	}

	public void setuType(String uType) {
		this.uType = uType;
	}

	
}
	

