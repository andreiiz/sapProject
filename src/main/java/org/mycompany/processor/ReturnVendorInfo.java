package org.mycompany.processor;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.fusesource.camel.component.sap.model.rfc.Table;
import org.mycompany.bean.VendorInfo;

public class ReturnVendorInfo {
	
	public void create(Exchange exchange) throws Exception {
	Structure vendorInfoResponse = exchange.getIn().getBody(Structure.class);
	
	if (vendorInfoResponse == null) {
		throw new Exception("No vendor info response");
	}
	
	@SuppressWarnings("unchecked")
//	Table<Structure> bapiReturn = vendorInfoResponse.get("RETURN", Table.class);
	Structure bapiReturnEntry = vendorInfoResponse.get("RETURN", Structure.class);
	/*if (!bapiReturnEntry.get("TYPE", String.class).equals("S")) {
		String message = bapiReturnEntry.get("MESSAGE", String.class);
		throw new Exception("BAPI call failed: " + message);
	}*/
	
	@SuppressWarnings("unchecked")
	Structure vendor = vendorInfoResponse.get("GENERALDETAIL", Structure.class);
	
	if (vendor == null || vendor.size() == 0) {
		throw new Exception("No vendor Info.");
	}
	
	//Structure vendor = vendorInfo.get(0);
	
	VendorInfo vendorI = new VendorInfo();
	
	String vendorId = vendor.get("VENDOR", String.class);
	if (vendorId != null) {
		vendorI.setVendor(vendorId);
	}
	String vendorName = vendor.get("NAME", String.class);
	if (vendorName != null) {
		vendorI.setName(vendorName);
	}
	
	String vendorCity = vendor.get("CITY", String.class);
	if (vendorCity != null) {
		vendorI.setCity(vendorCity);
	}
	
	String vendorDistrict = vendor.get("DISTRICT", String.class);
	if (vendorDistrict != null) {
		vendorI.setDistrict(vendorDistrict);
	}
	
	String vendorPB = vendor.get("PO_BOX", String.class);
	if (vendorPB != null) {
		vendorI.setPo_box(vendorPB);
	}
	
	String vendorPostlCode = vendor.get("POSTL_CODE", String.class);
	if (vendorPostlCode != null) {
		vendorI.setPost_code(vendorPostlCode);
	}
	
	String vendorCountry = vendor.get("COUNTRY", String.class);
	if (vendorCountry != null) {
		vendorI.setCountry(vendorCountry);
	}
	
	String vendorIso= vendor.get("COUNTRYISO", String.class);
	if (vendorIso != null) {
		vendorI.setCountryIso(vendorIso);
	}
	
	String vendorLang= vendor.get("LANGU", String.class);
	if (vendorLang != null) {
		vendorI.setLanguage(vendorLang);
	}
	
	String vendorLangIso= vendor.get("LANGU_ISO", String.class);
	if (vendorLangIso != null) {
		vendorI.setLanguageIso(vendorLangIso);
	}
	
	String vendorTel= vendor.get("TELEPHONE", String.class);
	if (vendorTel != null) {
		vendorI.setTelephone1(vendorTel);
	}
	
	String vendorAddr= vendor.get("ADDR", String.class);
	if (vendorAddr != null) {
		vendorI.setAddr(vendorAddr);
	}

	String vendorReg= vendor.get("REGION", String.class);
	if (vendorReg != null) {
		vendorI.setRegione(vendorReg);
	}
	
	String vendorStreet= vendor.get("STREET", String.class);
	if (vendorStreet != null) {
		vendorI.setStreet(vendorStreet);
	}
	
	String vendorpPcd= vendor.get("POBX_PCD", String.class);
	if (vendorpPcd != null) {
		vendorI.setPobx_pcd(vendorpPcd);
	}
	
	String vendorpurp_cmpl_flag= vendor.get("PURP_CMPL_FLAG", String.class);
	if (vendorpurp_cmpl_flag != null) {
		vendorI.setPurp_cmpl_flag(vendorpurp_cmpl_flag);
	}
	
	exchange.getIn().setBody(vendorI, VendorInfo.class);
	
	//exchange.getIn().setHeader("VendorInfo", vendorI);
  }
}
