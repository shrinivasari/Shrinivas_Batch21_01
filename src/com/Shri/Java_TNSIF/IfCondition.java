package com.Shri.Java_TNSIF;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 22;
	    if (time < 10) {
	      System.out.println("Good morning."); }
	    else if (time < 18) {
	      System.out.println("Good day.");
	    }  else {
	      System.out.println("Good evening.");
	    }
	    
	    // short hand if-else statement 
	    String result = (time < 18) ? "Good day." : "Good evening.";
	    System.out.println(result);
	}

}
