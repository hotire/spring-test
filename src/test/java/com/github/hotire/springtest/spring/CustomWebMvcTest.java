package com.github.hotire.springtest.spring;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Indexed;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
@WebMvcTest
public @interface CustomWebMvcTest {
    @AliasFor(annotation = WebMvcTest.class)
    String[] properties() default {};

    @AliasFor(annotation = WebMvcTest.class)
    Class<?>[] value() default {};

    @AliasFor(annotation = WebMvcTest.class)
    Class<?>[] controllers() default {};

    @AliasFor(annotation = WebMvcTest.class)
    boolean useDefaultFilters() default true;

    @AliasFor(annotation = WebMvcTest.class)
    Filter[] includeFilters() default {};

    @AliasFor(annotation = WebMvcTest.class)
    Filter[] excludeFilters() default {};

    @AliasFor(annotation = WebMvcTest.class)
    Class<?>[] excludeAutoConfiguration() default {};
}
