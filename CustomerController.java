package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.daoclasses.CustomerDAO;
import com.example.demo.entityclasses.Customer;


@Controller
public class CustomerController {
	@Autowired
	CustomerDAO customerDAOImp;

	@RequestMapping("/")
	public String getHome() {
		return "home.jsp";
	}

	@RequestMapping("/insertCustomerPage")
	public String getInsertCustomerPage() {
		return "insertcustomer.jsp";
	}

	@RequestMapping("/updateCustomerPage")
	public String getUpdateCustomerPage() {
		return "updatecustomer.jsp";
	}

	@RequestMapping("/deleteCustomerPage")
	public String getDeleteCustomerPage() {
		return "deletecustomer.jsp";
	}

	@RequestMapping("/SaveImage")
	public String getSaveImagePage() {
		return "saveimage.jsp";
	}

	@RequestMapping("/insertCustomer")
	public ModelAndView insertCustomer(Customer customer) {
		ModelAndView model = new ModelAndView();
		customerDAOImp.insertCustomer(customer);
		model.addObject("obj", customer);
		model.setViewName("display.jsp");
		return model;
	}

	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer) {
		ModelAndView model = new ModelAndView();
		customerDAOImp.updateCustomer(customer);
		model.addObject("obj", customer);
		model.setViewName("display.jsp");
		return model;
	}

	@RequestMapping("/deleteCustomer")
	public ModelAndView deleteCustomer(int custID) {
		ModelAndView model = new ModelAndView();
		customerDAOImp.deleteCustomer(custID);
		model.addObject("obj", custID);
		model.setViewName("displaydeletemessage.jsp");
		return model;
	}

	@RequestMapping("/findAllCustomer")
	public ModelAndView findAllCustomer() {
		ModelAndView model = new ModelAndView();
		List<Customer> customers = customerDAOImp.findAllCustomer();
		model.addObject("obj", customers);
		model.setViewName("displayAllCustomers.jsp");
		return model;
	}

	@RequestMapping("/uploadimage")
	public String uploadImage(@RequestParam("image") CommonsMultipartFile file ) {
		System.out.println(file.getName());
		System.out.println(file.getSize());
		return "filesuccess";
	}

}
