package com.example.demo.daoclasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entityclasses.Customer;
@Repository
public class CustomerDAOImplement implements CustomerDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertCustomer(Customer customer)
	{
		jdbcTemplate.update("INSERT INTO customer values (?,?,?)",customer.getCustID(),customer.getCustName(),customer.getCustCity());
	}
	
	public void updateCustomer(Customer customer)
	{
		jdbcTemplate.update("UPDATE customer SET custname=? , custcity=? where custid= ? ",customer.getCustName(),customer.getCustCity(),customer.getCustID());
	}
	
	public void deleteCustomer(int custID)
	{
		jdbcTemplate.update("delete from customer where custid=?",custID);
	}

	public  List<Customer> findAllCustomer()
	{
		return jdbcTemplate.query("SELECT * from Customer",
		        BeanPropertyRowMapper.newInstance(Customer.class));
	}

}
