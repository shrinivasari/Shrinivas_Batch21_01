package com.Shri.Abstraction;

//contained Class
class Addres{
	
	private String address;
	private int streetno;
	public Addres(String address, int streetno) {
		
		this.address = address;
		this.streetno = streetno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStreetno() {
		return streetno;
	}
	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}
	@Override
	public String toString() {
		return "Addres [address=" + address + ", streetno=" + streetno + "]";
	}
}
//container class
class Person{
	
	private String name;
	
	private Addres address; //HAs-A relationship with Class Address
	
	
	public Person(String name, Addres address) {
		
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addres getAddress() {
		return address;
	}
	public void setAddress(Addres address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", toString()=" + super.toString() + "]";
	}
	
}
public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addres a=new Addres("Bengaluru",23);
	      
	      Person p = new Person("Shrinivas",a);
	      
	      System.out.println(p);
	}

}
