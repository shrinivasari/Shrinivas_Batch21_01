package com.Shri.oppsProgram;
import java.util.Scanner;

public class CustomerOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       
	       String name,city;
	       int age;
	       
	       Customer customer = new Customer();
	       //Read Values from the user
	       System.out.println("Enter the Name");
	       name = sc.nextLine();
	       System.out.println("Enter the City");
	       city=sc.nextLine();
	       System.out.println("Enter the Age");
	       age=sc.nextInt();
	       
	       
	       
	       customer.setAge(age);
	       customer.setCustomerCity(city);
	       customer.setCustomerName(name);
	       
	       System.out.println(customer);
	       
	       System.out.println("--------------------------------------------");
	       
	       Customer customer1 = new Customer(name,city,age);
	       
	       System.out.println("Enter the Name");
	       sc.nextLine();
	       name = sc.nextLine();
	       
	       
	       System.out.println("Enter the City");
	       city=sc.nextLine();
	       
	       System.out.println("Enter the Age");
	       age=sc.nextInt();
	       
	       customer1.setCustomerName(name);
	       customer1.setAge(age);
	       
	       customer1.setCustomerCity(city);
	       
	       
	       
	       System.out.println(customer1);
	}

}
