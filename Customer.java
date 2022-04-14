package com.example.demo.entityclasses;

import java.util.Set;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Customer 
{
	@Id
	private int custID;
	private String custName;
	private String custCity;
	//private Set<Invoice> invoices;
	
	public Customer() {}
	
	public Customer(int custID, String custName, String custCity) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custCity = custCity;
	}
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custCity=" + custCity + "]";
	}
	
	
}
