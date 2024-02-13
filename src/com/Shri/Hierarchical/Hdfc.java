package com.Shri.Hierarchical;

public class Hdfc extends RBI{
	
	private String branchname;

	public Hdfc(String bankId, String countryname,String branchname) {
		super(bankId, countryname);
		this.branchname=branchname;
		// TODO Auto-generated constructor stub
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	@Override
	public String toString() {
		return "Hdfc branchname=" + branchname  + super.toString() + "";
	}
	

}