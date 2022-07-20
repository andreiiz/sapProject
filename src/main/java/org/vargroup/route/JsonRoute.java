package org.vargroup.route;



import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;


@Component
public class JsonRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		JacksonDataFormat vendorJson = new JacksonDataFormat();
		from("direct:jsonTrasformation")
		.routeId("jsonRoute")
		.marshal(vendorJson)
		.streamCaching() //; se metto prima direct:rest il messaggio è illeggibile. con prima log mostra json
		
		.to("log: il formato Json e'")
		.to("direct:rest") ;
	}
	
}
