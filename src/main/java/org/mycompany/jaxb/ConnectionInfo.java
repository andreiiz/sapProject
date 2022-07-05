package org.mycompany.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * JAXB Bean containing Connection Information data from a SAP BOOK_FLIGHT response.
 * 
 * @author William Collins <punkhornsw@gmail.com>
 *
 */
@XmlRootElement(name="CONNINFO", namespace="http://sap.fusesource.org/rfc/flbkdemoServer/BOOK_FLIGHT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConnectionInfo {

	@XmlAttribute(name="CONNID")
	String connectionId;

	@XmlAttribute(name="AIRLINE")
	String airline;

	@XmlAttribute(name="PLANETYPE")
	String planeType;

	@XmlAttribute(name="CITYFROM")
	String cityFrom;

	@XmlAttribute(name="DEPDATE")
	@XmlJavaTypeAdapter(DateAdapter.class)
	Date departureDate;

	@XmlAttribute(name="DEPTIME")
	@XmlJavaTypeAdapter(DateAdapter.class)
	Date departureTime;

	@XmlAttribute(name="CITYTO")
	String cityTo;

	@XmlAttribute(name="ARRDATE")
	@XmlJavaTypeAdapter(DateAdapter.class)
	Date arrivalDate;

	@XmlAttribute(name="ARRTIME")
	@XmlJavaTypeAdapter(DateAdapter.class)
	Date arrivalTime;

	public String getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		return "ConnectionInfo [connectionId=" + connectionId + ", airline=" + airline + ", planeType=" + planeType + ", cityFrom=" + cityFrom
				+ ", departureDate=" + departureDate + ", departureTime=" + departureTime + ", cityTo=" + cityTo + ", arrivalDate=" + arrivalDate
				+ ", arrivalTime=" + arrivalTime + "]";
	}

}
