package com.Shri.Java_TNSIF;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;               // integer (whole number)
	    float myFloatNum = 5.99f;    // floating point number
	    char myLetter = 'D';         // character
	    boolean myBool = true;       // boolean
	    
	    double myDouble = myNum;   // Auto casting integer to double
	    int myInteger = (int) myDouble; // Manual casting: double to integer
	    
	    String myText = "Hello";     // String    
	    System.out.println(myNum);
	    System.out.println(myFloatNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
	    
	    // type casting
	    System.out.println("The int is converted into double");
	    System.out.println(myDouble);
	    
	    System.out.println("The double is converted into int");
	    System.out.println(myInteger);
	    
	}

}
