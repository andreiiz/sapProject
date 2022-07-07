package org.mycompany.bean;

public class VendorInfo {
	public String vendor;
	
	public String Name;
	
	public String city;
	
	public String district;
	
	public String po_box;
	
	public String post_code;
	
	public String regione;
	
	public String street;
	
	public String country;
	
	public String language;
	
	public String telephone1;
	
	public String telephone2;

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPo_box() {
		return po_box;
	}

	public void setPo_box(String po_box) {
		this.po_box = po_box;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	@Override
	public String toString() {
		return "VendorInfo [vendor=" + vendor + ", Name=" + Name + ", city=" + city + ", district=" + district
				+ ", po_box=" + po_box + ", post_code=" + post_code + ", regione=" + regione + ", street=" + street
				+ ", country=" + country + ", language=" + language + ", telephone1=" + telephone1 + ", telephone2="
				+ telephone2 + "]";
	}
	
	
}
