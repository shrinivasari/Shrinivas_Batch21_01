package com.Shri.Java_TNSIF;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;

	    //Arithmetic operators
		int x=a+b; // Addition +,Subtraction -,Multiplication *,Division /
		
		int y=++a; // pre-increment add one and assign
		int z=a++; // post increment
		System.out.println("Addition="+x+"\nPre-increment="+y+"\nPost-increment="+z);
		
	
	    //Assignment operators
		a=b; // >>=,<<=,+=,-=,*=
		System.out.println("Value of a ="+a);
		
	    //Comparison operators
		if(a!=b) //==,<,>,<=,>=
			System.out.println("true");
		System.out.println("False");
		
	    //Logical operators
		 if(a>10 && b<20) 
			 System.out.println("True");
		 System.out.println("False");
		
		 System.out.println(!(a > 3 && a < 10));

	}

}
