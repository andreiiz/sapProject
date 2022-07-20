package org.vargroup.bean;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class GetIDBean {
	
//	private String id;
	
		public void getId(Exchange exchange) {
			//this.id = id;
			int iddd = exchange.getIn().getBody(Integer.class);
			System.out.println("L'id é" + iddd);
		}
}
