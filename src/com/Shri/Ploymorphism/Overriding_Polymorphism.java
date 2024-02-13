package com.Shri.Ploymorphism;

class Rbi{
	 int a=10;
	 int b=20;
	 
	 void sum() {
		 int c=a+b;
	 }
}

class Sbi extends Rbi{
	 int x=20;
	 int y =30;
	 
	 void sum() {
		 int z=x+y;
	 }
}
public class Overriding_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
