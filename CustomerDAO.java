package com.example.demo.daoclasses;

import java.util.List;

import com.example.demo.entityclasses.Customer;

public interface CustomerDAO 
{
	public void insertCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(int custID);
	
	public  List<Customer> findAllCustomer();
}
