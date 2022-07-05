package org.mycompany.route;

import org.mycompany.*;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class SapRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {		
		from("direct:getFlightCustomerInfo")
	    .to("bean:createFlightCustomerGetListRequest")
	    .to("sap-srfc-destination:quickDestination:BAPI_FLCUST_GETLIST")
	    .to("bean:returnFlightCustomerInfo");	
	}
}
