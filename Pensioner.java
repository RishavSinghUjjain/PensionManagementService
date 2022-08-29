package com.pension.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pensioner")
public class Pensioner {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="pr_name")
	private String name;
	
	@Column(name="pr_mobile")
	private Long mobile;
	
	@Column(name="pr_dob")
	private String dob;
	
	@Column(name="pr_address")
	private String address;
	
	@Column(name="pr_aadhar")
	private Long aadhar;
	
	@Column(name="pr_emailId")
	private String emailId;
	
	@Column(name="pr_accountNumber")
	private Long accountNumber;
	
	@Column(name="pr_basicSalary")
	private Long basicSalary;
	
	@Column(name="pr_dearnessAllowance")
	private Long dearnessAllowance;
	
	@Column(name="pr_designation")
	private String designation;
	
	@Column(name="pr_department")
	private String department;
	
	@Column(name="pr_LiveCertificate")
	private String liveCertificate;
	
	@Column(name="pr_DeathCertificate")
	private String deathCertificate;
	
	@Column(name="pr_nom_name")
	private String nomineeName;
	
	@Column(name="pr_nom_address")
	private String nomineeAddress;
	
	@Column(name="pr_nom_mobile")
	private Long nomineeMobile;
	

	@Column(name="pr_nom_aadhar")
	private Long nomineeAadhar;
	
	@Column(name="pr_nom_emailId")
	private String nomineeEmailId;
	
	public Pensioner() {
		
	}

	public Pensioner(Long id, String name, Long mobile, String dob, String address, Long aadhar, String emailId,
			Long accountNumber, Long basicSalary, Long dearnessAllowance, String designation, String department,
			String liveCertificate, String deathCertificate ,String nomineeName, String nomineeAddress, Long nomineeMobile, Long nomineeAadhar,
			String nomineeEmailId) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.dob = dob;
		this.address = address;
		this.aadhar = aadhar;
		this.emailId = emailId;
		this.accountNumber = accountNumber;
		this.basicSalary = basicSalary;
		this.dearnessAllowance = dearnessAllowance;
		this.designation = designation;
		this.department = department;
		this.liveCertificate = liveCertificate;
		this.deathCertificate = deathCertificate;
		this.nomineeName = nomineeName;
		this.nomineeAddress = nomineeAddress;
		this.nomineeMobile = nomineeMobile;
		this.nomineeAadhar = nomineeAadhar;
		this.nomineeEmailId = nomineeEmailId;
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

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAadhar() {
		return aadhar;
	}

	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Long basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Long getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(Long dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLiveCertificate() {
		return liveCertificate;
	}

	public void setLiveCertificate(String liveCertificate) {
		this.liveCertificate = liveCertificate;
	}

	public String getDeathCertificate() {
		return deathCertificate;
	}

	public void setDeathCertificate(String DeathCertificate, String deathCertificate) {
		this.deathCertificate = deathCertificate;
	}
	
	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeAddress() {
		return nomineeAddress;
	}

	public void setNomineeAddress(String nomineeAddress) {
		this.nomineeAddress = nomineeAddress;
	}

	public Long getNomineeMobile() {
		return nomineeMobile;
	}

	public void setNomineeMobile(Long nomineeMobile) {
		this.nomineeMobile = nomineeMobile;
	}

	public Long getNomineeAadhar() {
		return nomineeAadhar;
	}

	public void setNomineeAadhar(Long nomineeAadhar) {
		this.nomineeAadhar = nomineeAadhar;
	}

	public String getNomineeEmailId() {
		return nomineeEmailId;
	}

	public void setNomineeEmailId(String nomineeEmailId) {
		this.nomineeEmailId = nomineeEmailId;
	}

}
