package com.Shri.TNSIF_Inheritance;

public class Citizen {
	private String Name,Addhar,address;

	public Citizen() {
		// no required of super keyword
		System.out.println("Citizen object Creation");
	}

	public Citizen(String name, String addhar, String address) {
		
		this.Name = name;
		this.Addhar = addhar;
		this.address = address;
	}

	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddhar() {
		return Addhar;
	}

	public void setAddhar(String addhar) {
		Addhar = addhar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Citizen [Name=" + Name + ", Addhar=" + Addhar + ", address=" + address + "]";
	}
}
