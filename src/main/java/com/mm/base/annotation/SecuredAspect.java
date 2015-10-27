package com.mm.base.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class SecuredAspect {

    private static final Logger log = LoggerFactory.getLogger(SecuredAspect.class);


    @Before("@annotation(com.mm.base.annotation.Secured)")
    public void secured() throws Throwable {
        try {
            log.info("~~~~~~~~ START METHOD {} ~~~~~~~~");
            System.out.println("injected");

        } finally {
            log.info("~~~~~~~~ END METHOD {} ~~~~~~~~");
        }
    }

}
