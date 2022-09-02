package org.vargroup.configuration;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ClientIntelligence;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.client.hotrod.configuration.SaslQop;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RemoteCacheConfig {

    private Integer socketTimeout = 5000;
    private Integer connecionTimeout = 5000;
    private Integer maxRetries = 1;
    
    @Bean
    public RemoteCacheManager cacheContainer() {
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.addServer()
        .host("sap-grid.datagrid.svc.cluster.local")
        .port(11222);
        builder.socketTimeout(socketTimeout);
        builder.connectionTimeout(connecionTimeout);
        builder.maxRetries(maxRetries);
        builder.connectionPool().minIdle(10);
        builder.clientIntelligence(ClientIntelligence.BASIC);
 
        try {
            builder.security().authentication().enable()
                    .username("developer")
                    .password("mjzeawA9diahCyzP")
                    .serverName("datagrid")
                    .realm("default")
                    .saslMechanism("PLAIN")
                    .saslQop(SaslQop.AUTH)
                    .ssl()
                    .trustStorePath("/var/run/secrets/kubernetes.io/serviceaccount/service-ca.crt");
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        return new RemoteCacheManager(builder.build());
    }
}
