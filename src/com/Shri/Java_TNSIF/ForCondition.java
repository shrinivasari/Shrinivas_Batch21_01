package com.Shri.Java_TNSIF;

public class ForCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cars[]= {"Volvo", "BMW", "Ford", "Mazda"};
		
		// for condition 
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.println(i);
			}
		
		// for-each condition using array
		for (String i : cars) {
			  System.out.println(i);
			}
	}

}
