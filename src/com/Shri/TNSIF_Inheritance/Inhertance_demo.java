package com.Shri.TNSIF_Inheritance;

class A{
	int i;
	void display() {
		System.out.println(i);
	}
}
class B extends A{
	int j;
	
	
	void display() {
		System.out.println(j);
		System.out.println(super.i);// we need to assign the variable name to the super keyword
	}
}
public class Inhertance_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		
		
		obj.i=1;
		obj.j=2;
		obj.display();

	}

}
