package org.vargroup.bean;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;


public class CreateRequest {
	
	/*private String id;
	
	private Structure insertId(String id, Structure requestTo) {
		requestTo.put("VENDORNO" , id);
		return requestTo;
	}*/

	public void createRequest(Exchange exchange) throws Exception {

		// Create a request message from the endpoint to the GetList method of the FlightCustomer BAPI
		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint("sap-srfc-destination:quickDestination:BAPI_VENDOR_GETDETAIL", SapSynchronousRfcDestinationEndpoint.class);
		Structure request = endpoint.createRequest();
		
		
		request.put("VENDORNO", "0001000003");

		// Set the request in in the body of the exchange's message.
	//	exchange.getIn().setBody(insertId(id, request)); //qua era request e basta
		exchange.getIn().setBody(request);
	}
}
