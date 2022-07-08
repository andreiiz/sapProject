package org.mycompany.bean;

import java.io.Serializable;

public class VendorInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	private String vendor;
	
	private String name;
	
	private String name2;
	
	private String name3;
	
	private String name4;
	
	private String city;
	
	private String district;
	
	
	public String countryIso;
	
	private String pobx_pcd;
	
	private String po_box;
	
	private String post_code;
	
	private String regione;
	
	private String street;
	
	private String country;
	
	private String language;
	
	private String telephone;
	
	private String telephone2;

	private String languageIso;

	private String addr;
	
	private String purp_cmpl_flag;

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}
	
	public String getName2() {
		return name2;
	}
	
	public String getName3() {
		return name3;
	}
	
	public String getName4() {
		return name4;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setName2(String name2) {
		this.name2 = name2;
	}
	
	public void setName3(String name3) {
		this.name3 = name3;
	}
	
	public void setName4(String name4){
		this.name4 = name4;
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
	
	public String getCountryIso() {
		return countryIso;
	}

	public void setCountryIso(String countryIso) {
		this.countryIso = countryIso;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getLanguageIso() {
		return languageIso;
	}

	public void setLanguageIso(String languageIso) {
		this.languageIso = languageIso;
	}

	public String getTelephone1() {
		return telephone;
	}

	public void setTelephone1(String telephone1) {
		this.telephone = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}
	

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}



	public String getPobx_pcd() {
		return pobx_pcd;
	}

	public void setPobx_pcd(String pobx_pcd) {
		this.pobx_pcd = pobx_pcd;
	}

	public String getPurp_cmpl_flag() {
		return purp_cmpl_flag;
	}

	public void setPurp_cmpl_flag(String purp_cmpl_flag) {
		this.purp_cmpl_flag = purp_cmpl_flag;
	}

	@Override
	public String toString() {
		return "VendorInfo [vendor=" + vendor + ", name=" + name + ", name2=" + name2 + ", name3=" + name3 + ", name4="
				+ name4 + ", city=" + city + ", district=" + district + ", countryIso=" + countryIso + ", pobx_pcd="
				+ pobx_pcd + ", po_box=" + po_box + ", post_code=" + post_code + ", regione=" + regione + ", street="
				+ street + ", country=" + country + ", language=" + language + ", telephone=" + telephone
				+ ", telephone2=" + telephone2 + ", languageIso=" + languageIso + ", addr=" + addr + ", purp_cmpl_flag="
				+ purp_cmpl_flag + "]";
	}
	
	
}
