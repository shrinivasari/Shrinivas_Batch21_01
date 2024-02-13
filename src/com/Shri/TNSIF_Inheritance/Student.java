package com.Shri.TNSIF_Inheritance;

public class Student extends Citizen{

	 private String srn,collegename;

	public Student() {
		super();
	}

	public Student(String name, String addhar, String address ,String srn, String collegename) {
		super(name,addhar,address);
		
		this.srn = srn;
		this.collegename = collegename;
	}

	public String getSrn() {
		return srn;
	}

	public void setSrn(String srn) {
		this.srn = srn;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Student [srn=" + srn + ", collegename=" + collegename + ", getName()=" + getName() + ", getAddhar()="
				+ getAddhar() + ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + "]";
	}

	
	 
	 
}