package org.mycompany.bean;

public class FlightCustomerInfo {
	private String customerNumber;

	private String formOfAddress;
	
	private String name;
	
	private String street;  
	
	private String poBox;
	
	private String city;
	
	private String region;
	
	private String postalCode;
	
	private String country;
	
	private String countryIso;
	
	private String phone;
	
	private String email;
	
	
	public void setCustomerNumber(String customerNumber) {
		// TODO Auto-generated method stub
		this.customerNumber = customerNumber;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email= email;
	}

	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		this.phone= phone;
	}

	public void setRegion(String region) {
		// TODO Auto-generated method stub
		this.region = region;
	}

	public void setFormOfAddress(String formOfAddress) {
		// TODO Auto-generated method stub
		this.formOfAddress= formOfAddress;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name= name;
		
	}

	public void setCountryIso(String countryIso) {
		// TODO Auto-generated method stub
		this.countryIso=countryIso;
	}

	public void setCountry(String country) {
		// TODO Auto-generated method stub
		this.country = country;
	}

	public void setCity(String city) {
		// TODO Auto-generated method stub
		this.city = city;
	}

	public void setPostalCode(String postalCode) {
		// TODO Auto-generated method stub
		this.postalCode = postalCode;
	}

	public void setStreet(String street) {
		// TODO Auto-generated method stub
		this.street=street;
		
	}

	public void setPoBox(String poBox) {
		// TODO Auto-generated method stub
		this.poBox=poBox;
		
	}
	
	@Override
	public String toString() {
		return "FlightCustomerInfo [customerNumber=" + customerNumber + ", formOfAddress=" + formOfAddress + ", name=" + name + ", street=" + street
				+ ", poBox=" + poBox + ", city=" + city + ", region=" + region + ", postalCode=" + postalCode + ", country=" + country + ", countryIso="
				+ countryIso + ", phone=" + phone + ", email=" + email + "]";
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public String getFormOfAddress() {
		return formOfAddress;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getPoBox() {
		return poBox;
	}

	public String getCity() {
		return city;
	}

	public String getRegion() {
		return region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryIso() {
		return countryIso;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
}
