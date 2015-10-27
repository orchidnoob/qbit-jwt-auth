package com.mm.base;

import com.mm.base.config.Config;
import com.mm.base.endpoint.AccountsEndpoint;
import com.mm.base.endpoint.AuthEndpoint;
import io.advantageous.qbit.admin.ManagedServiceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        final ManagedServiceBuilder managedServiceBuilder =
                ManagedServiceBuilder.managedServiceBuilder()
                        .setRootURI("/v1")
                        .setPort(8888);

        managedServiceBuilder
                .addEndpointService(context.getBean(AuthEndpoint.class))
                .addEndpointService(new AccountsEndpoint())
                .getEndpointServerBuilder()
                .build().startServer();

        context.getBean(AuthEndpoint.class).logout();
        managedServiceBuilder.getAdminBuilder().build().startServer();

        System.out.println("Todo Server and Admin Server started");
    }
}
