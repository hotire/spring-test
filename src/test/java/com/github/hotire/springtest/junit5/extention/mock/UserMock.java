package com.github.hotire.springtest.junit5.extention.mock;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserMock {

    long id() default 1L;

    String name() default "hotire";
}
