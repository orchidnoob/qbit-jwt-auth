package com.mm.base.config;

import com.mm.base.MessagePrinter;
import com.mm.base.endpoint.AuthEndpoint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Import(PermissionAopConfig.class)
@PropertySource("auth.properties")
public class Config {
    @Bean
    public MessagePrinter messagePrinter() {
        return new MessagePrinter();
    }

    @Bean
    public AuthEndpoint authEndpoint(@Value("http.port") String port, MessagePrinter printer) {
        return new AuthEndpoint(printer);
    }
}
