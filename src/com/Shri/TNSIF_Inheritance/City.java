package com.Shri.TNSIF_Inheritance;

public class City extends State{
	private String cityname;

	
	
	public City() {
		super();
	}


	public City(String cityname,String statename,String countryname) {
		super(statename,countryname);
		this.cityname = cityname;
	}


	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", getStatename()=" + getStatename() + ", toString()=" + super.toString()
				+ ", getCountryname()=" + getCountryname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
  
}