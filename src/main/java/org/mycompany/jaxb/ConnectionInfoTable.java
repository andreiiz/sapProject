package org.mycompany.jaxb;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * JAXB Bean containing Connection Information Table data from a SAP BOOK_FLIGHT response.
 * 
 * @author William Collins <punkhornsw@gmail.com>
 *
 */
@XmlRootElement(name="CONNINFO_TABLE", namespace="http://sap.fusesource.org/rfc/flbkdemoServer/BOOK_FLIGHT")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConnectionInfoTable {
	
	@XmlElement(name="row")
	List<ConnectionInfo> rows;

	public List<ConnectionInfo> getRows() {
		return rows;
	}

	public void setRows(List<ConnectionInfo> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "ConnectionInfoList [rows=" + rows + "]";
	}
	
}