package org.mycompany.processor;


import org.apache.camel.Exchange;
import org.apache.camel.language.Bean;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.mycompany.jaxb.BookFlightRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CreateFlightCustomerGetListRequest {

	private static final Logger LOG = LoggerFactory.getLogger(CreateFlightCustomerGetListRequest.class);

	/**
	 * Builds SAP Request Object for BAPI_FLCUST_GETLIST call using data from
	 * the BOOK_FLIGHT request.
	 * 
	 * @param exchange
	 * @throws Exception
	 */

	public void create(Exchange exchange) throws Exception {

		// Get BOOK_FLIGHT Request JAXB Bean object.
		BookFlightRequest bookFlightRequest = exchange.getIn().getBody(BookFlightRequest.class);

		// Create SAP Request object from target endpoint.
		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint("sap-srfc-destination:quickDestination:BAPI_FLCUST_GETLIST", SapSynchronousRfcDestinationEndpoint.class);
		Structure request = endpoint.createRequest();
		
		// Add Customer Name to request if set
		if (bookFlightRequest.getCustomerName() != null && bookFlightRequest.getCustomerName().length() > 0) {
			request.put("CUSTOMER_NAME", bookFlightRequest.getCustomerName());
			if (LOG.isDebugEnabled()) {
				LOG.debug("Added CUSTOMER_NAME = '{}' to request", bookFlightRequest.getCustomerName());
			}
		} else {
			throw new Exception("No Customer Name");
		}
		
		// Put request object into body of exchange message.
		exchange.getIn().setBody(request);
		
	}	

}

