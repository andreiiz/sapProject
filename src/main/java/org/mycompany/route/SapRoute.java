package org.mycompany.route;

import org.mycompany.*;
import org.mycompany.jaxb.VendorJson;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;


@Component
public class SapRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		JacksonDataFormat vendorJson = new JacksonDataFormat();
		from("direct:jsonTrasformation")
		.marshal(vendorJson)
		.to("log: il formato Json e'");   	
	}
	
}

