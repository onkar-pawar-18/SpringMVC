package com.example.demo.entityclasses;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Invoice 
{
	@Id
	private int invoiceID;
	private float invoiceTotal;
	
	public Invoice() {}
	
	public Invoice(int invoiceID, float invoiceTotal) {
		super();
		this.invoiceID = invoiceID;
		this.invoiceTotal = invoiceTotal;
	}
	
	public int getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}
	public float getInvoiceTotal() {
		return invoiceTotal;
	}
	public void setInvoiceTotal(float invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceID=" + invoiceID + ", invoiceTotal=" + invoiceTotal + "]";
	}
	
	
}
