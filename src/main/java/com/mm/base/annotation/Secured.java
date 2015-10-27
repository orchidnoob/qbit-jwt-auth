package com.mm.base.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Secured {
    String[] permission() default {};

    String[] role() default {};
}
