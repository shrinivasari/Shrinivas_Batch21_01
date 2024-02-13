package com.Shri.TNSIF_Inheritance;

public class Country {
	private String countryname;

	public Country() {
		
	}

	public Country(String countryname) {
		
		this.countryname = countryname;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	@Override
	public String toString() {
		return "Country [countryname=" + countryname + "]";
	}
}
