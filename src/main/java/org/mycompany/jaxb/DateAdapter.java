package org.mycompany.jaxb;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XML Adapter formating Date objects to and from the "yyyy-MM-dd'T'HH:mm:ss.SSSZ" string format. 
 * 
 * @author William Collins <punkhornsw@gmail.com>
 *
 */
public class DateAdapter extends XmlAdapter<String, Date> {
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

	@Override
	public Date unmarshal(String v) throws Exception {
		return dateFormat.parse(v);
	}

	@Override
	public String marshal(Date v) throws Exception {
		return dateFormat.format(v);
	}

}