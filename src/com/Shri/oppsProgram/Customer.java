package com.Shri.oppsProgram;

public class Customer {
	private String customerName, customerCity;
	private int age;
	
	//Default constructor
	public Customer() {
		System.out.println("Default Constructor");
	}
	// Parameterized Constructor

	public Customer(String customerName, String customerCity, int age) {
		System.out.println("Parameter Constructors");
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.age = age;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", age=" + age + "]";
	}

}
