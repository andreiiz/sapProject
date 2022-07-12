package org.mycompany;

import org.apache.camel.Exchange;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;

/**
 * A {@link CreateRequest} is a processor bean which builds a request to the GetList method of the FlightCustomer BAPI
 * and sets that request in the body of the exchange's message.
 * 
 * @author William Collins (punkhornsw@gmail.com)
 *
 */
public class CreateRequest {

	public void createRequest(Exchange exchange) throws Exception {

		// Create a request message from the endpoint to the GetList method of the FlightCustomer BAPI
		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint("sap-srfc-destination:quickDestination:BAPI_VENDOR_GETDETAIL", SapSynchronousRfcDestinationEndpoint.class);
		Structure request = endpoint.createRequest();
		
		// Add query parameters to the request to retrieve upto 10 Customer records including Web Users.
		//request.put("CUSTOMER_NAME", "*");
	//	request.put("MAX_ROWS", 10);
		//request.put("WEB_USER", "*");
	//	request.put("VENDORNO", "0190100175"); 
		request.put("VENDORNO", "0001000003");

		// Set the request in in the body of the exchange's message.
		exchange.getIn().setBody(request);
	}
}
