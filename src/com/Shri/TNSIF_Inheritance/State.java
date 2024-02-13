package com.Shri.TNSIF_Inheritance;

public class State extends Country{
	private String Statename;

	
	public State() {
		super();
	}


	public State(String statename,String countryname) {
		super(countryname);
		Statename = statename;
	}


	public String getStatename() {
		return Statename;
	}


	public void setStatename(String statename) {
		Statename = statename;
	}


	@Override
	public String toString() {
		return "State [Statename=" + Statename + "]";
	}
	 
	
    
}