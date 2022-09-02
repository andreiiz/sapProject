package org.vargroup.route;


//import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.infinispan.InfinispanConstants;
import org.apache.camel.component.infinispan.InfinispanOperation;
import org.springframework.stereotype.Component;

@Component
public class InfinispanRoute extends RouteBuilder {

	JsonObject jsonObject;
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("direct:dataGrid").startupOrder(3)
		.routeId("routeInfini")
		.process(new Processor() {	
		public void process(Exchange exchange) {
		String body = exchange.getIn().getBody(String.class);
		// jsonObject = JsonParser.parseString(body.toString()).getAsJsonObject();
	//	 exchange.getIn().setBody(jsonObject);
			exchange.getIn().setBody(body);
		}
		})
	//	.convertBodyTo(String.class)
		//.to("log: il formato è:")
		.setHeader(InfinispanConstants.OPERATION).constant(InfinispanOperation.PUT)
        .setHeader(InfinispanConstants.KEY).constant("12345")
   
      .setHeader(InfinispanConstants.VALUE).body() //String.class
      .to("log: il body è:")
		.to("infinispan:sapp-test");
	}
}
