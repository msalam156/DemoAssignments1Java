package com.nissan.class6Dec;

import java.time.LocalDate;

public class Customer {
	// intance variable
	private String customerName;
	private double accountBalance;
	private LocalDate dateOfJoining;
	public String getCustomerName() {
	return customerName;
	}
	Customer(){}
	Customer(String name){
		this.customerName = name;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}
