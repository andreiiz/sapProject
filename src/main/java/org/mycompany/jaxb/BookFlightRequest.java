package org.mycompany.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlRootElement(name="Request", namespace="http://sap.fusesource.org/rfc/flbkdemoServer/BOOK_FLIGHT")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookFlightRequest {
	
	@XmlAttribute(name="CUSTNAME")
	private String customerName;
	
	@XmlAttribute(name="FLIGHTDATE")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date flightDate;
	
	@XmlAttribute(name="TRAVELAGENCYNUMBER")
	private String travelAgencyNumber;
	
	@XmlAttribute(name="DESTINATION_FROM")
	private String startAirportCode;
	
	@XmlAttribute(name="DESTINATION_TO")
	private String endAirportCode;
	
	@XmlAttribute(name="PASSFORM")
	private String passengerFormOfAddress;
	
	@XmlAttribute(name="PASSNAME")
	private String passengerName;
	
	@XmlAttribute(name="PASSBIRTH")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date passengerDateOfBirth;
	
	@XmlAttribute(name="CLASS")
	private String flightClass;
	
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public String getTravelAgencyNumber() {
		return travelAgencyNumber;
	}
	public void setTravelAgencyNumber(String travelAgencyNumber) {
		this.travelAgencyNumber = travelAgencyNumber;
	}
	
	public String getStartAirportCode() {
		return startAirportCode;
	}
	public void setStartAirportCode(String startAirportCode) {
		this.startAirportCode = startAirportCode;
	}
	public String getEndAirportCode() {
		return endAirportCode;
	}
	public void setEndAirportCode(String endAirportCode) {
		this.endAirportCode = endAirportCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassengerFormOfAddress() {
		return passengerFormOfAddress;
	}
	public void setPassengerFormOfAddress(String passengerFormOfAddress) {
		this.passengerFormOfAddress = passengerFormOfAddress;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Date getPassengerDateOfBirth() {
		return passengerDateOfBirth;
	}
	public void setPassengerDateOfBirth(Date passengerDateOfBirth) {
		this.passengerDateOfBirth = passengerDateOfBirth;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	@Override
	public String toString() {
		return "BookFlightRequest [customerName=" + customerName + ", flightDate=" + flightDate + ", travelAgencyNumber=" + travelAgencyNumber
				+ ", startAirportCode=" + startAirportCode + ", endAirportCode=" + endAirportCode + ", passengerFormOfAddress=" + passengerFormOfAddress
				+ ", passengerName=" + passengerName + ", passengerDateOfBirth=" + passengerDateOfBirth + ", flightClass=" + flightClass + "]";
	}

}

