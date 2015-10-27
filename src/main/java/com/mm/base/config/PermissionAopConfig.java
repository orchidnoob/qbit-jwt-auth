package com.mm.base.config;

import com.mm.base.annotation.SecuredAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PermissionAopConfig {
    @Bean
    public SecuredAspect securedAspect() {
        return new SecuredAspect();
    }
}
