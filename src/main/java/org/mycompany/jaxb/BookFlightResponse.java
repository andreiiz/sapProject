package org.mycompany.jaxb;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * JAXB Bean containing SAP BOOK_FLIGHT response data.
 * 
 * @author William Collins <punkhornsw@gmail.com>
 *
 */
@XmlRootElement(name="Response", namespace="http://sap.fusesource.org/rfc/flbkdemoServer/BOOK_FLIGHT")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookFlightResponse {
	
	@XmlAttribute(name="TRIPNUMBER")
	private String tripNumber;

	@XmlAttribute(name="TICKET_PRICE")
	private BigDecimal ticketPrice;
	
	@XmlAttribute(name="TICKET_TAX")
	private BigDecimal ticketTax;
	
	@XmlAttribute(name="CURRENCY")
	private String currency;

	@XmlAttribute(name="PASSFORM")
	private String passengerFormOfAddress;
	
	@XmlAttribute(name="PASSNAME")
	private String passengerName;
	
	@XmlAttribute(name="PASSBIRTH")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date passengerDateOfBirth;
	
	@XmlElement(name="FLTINFO")
	private FlightInfo flightInfo;

	@XmlElement(name="CONNINFO")
	private ConnectionInfoTable connectionInfo;

	public String getTripNumber() {
		return tripNumber;
	}
	public void setTripNumber(String tripNumber) {
		this.tripNumber = tripNumber;
	}
	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public BigDecimal getTicketTax() {
		return ticketTax;
	}
	public void setTicketTax(BigDecimal ticketTax) {
		this.ticketTax = ticketTax;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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

	@Override
	public String toString() {
		return "BookFlightResponse [ticketPrice=" + ticketPrice + ", ticketTax=" + ticketTax + ", currency=" + currency + ", passengerFormOfAddress="
				+ passengerFormOfAddress + ", passengerName=" + passengerName + ", passengerDateOfBirth=" + passengerDateOfBirth + ", flightInfo=" +  "]";
	}
}
