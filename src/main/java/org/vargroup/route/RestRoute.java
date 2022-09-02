//package org.vargroup.route;
//
//
//
//import org.apache.camel.Exchange;
//import org.apache.camel.Processor;
//import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.component.jackson.JacksonDataFormat;
//import org.apache.camel.model.rest.RestBindingMode;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RestRoute extends RouteBuilder {
//
//	@Override
//	public void configure() throws Exception {
		
		/*
		JacksonDataFormat vendorJson = new JacksonDataFormat();
		restConfiguration()
		.component("servlet")
			.host("localhost")
			.port(8080)
			.bindingMode(RestBindingMode.json);
	
		
		rest("/vendors")
		
		.get("/mex").produces(MediaType.APPLICATION_JSON_VALUE)
		.consumes("application/json")
		//.get("{id}")
		 //.to("bean:getID?method=getId(${header.id}")
		//.to("log: }");
		//.to("direct:hello");
		
		//.from("direct:hello")
		//.transform().simple("hello world");
	//	.route()
		
		.route()
		.routeId("restRoute")
		.from("direct:rest")
		
		.streamCaching()
		.marshal(vendorJson)
		
		
		.to("log: rotta rest e':")
		//.setBody(simple("${body}"));
		.transform().simple("${body}");
		//.transform().body();
		*/
	//	.to("log:loggingLevel=INFO  message=${body}");
		
		//.from("direct:rest")
		//.setBody(); da eccezione ma torna json
	//	.transform().simple("hello world"); cosi funge l' hello wolrd dopo il route()
	
//}
//}
	

