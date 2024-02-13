package com.Shri.Hierarchical;

public class RBI {
	private String BankId,countryname;

	public RBI(String bankId, String countryname) {
		
		BankId = bankId;
		this.countryname = countryname;
	}

	public String getBankId() {
		return BankId;
	}

	public void setBankId(String bankId) {
		BankId = bankId;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	@Override
	public String toString() {
		return "RBI  BankId=" + BankId + ", countryname=" + countryname + "";
	}
}
