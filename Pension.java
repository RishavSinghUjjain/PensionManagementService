package com.pension.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pension")
public class Pension {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="p_name")
	private String name;
	
	@Column(name="p_year")
	private String year;
	
	@Column (name ="p_month")
	private String month;
	
	@Column (name ="p_amount")
	private String amount;
	
	@Column (name ="p_DA")
	private Long DA;
	
	public Pension()
	{
		
	}

	public Pension(Long id, String name, String year, String month, String amount, Long DA) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.month = month;
		this.amount = amount;
		this.DA = DA;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getDA() {
		return DA;
	}

	public void setDA(Long dA) {
		DA = dA;
	}
	
}
