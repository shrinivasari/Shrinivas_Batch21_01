package com.Shri.Abstraction;

class Employee{
	
	private String emNAme;

	public Employee(String emNAme) {
		
		this.emNAme = emNAme;
	}

	public String getEmNAme() {
		return emNAme;
	}

	public void setEmNAme(String emNAme) {
		this.emNAme = emNAme;
	}

	@Override
	public String toString() {
		return "Employee [emNAme=" + emNAme + "]";
	}	
}

class Manager extends Employee{
	
	private String managerName;

	public Manager(String managerName, String emNAme) {
		super(emNAme);
		this.managerName = managerName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", getEmNAme()=" + getEmNAme() + ", toString()="
				+ super.toString() + "]";
	}
	
}
public class IsaRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Ashoke","Ashoke");
		System.out.println(m);
	}

}
