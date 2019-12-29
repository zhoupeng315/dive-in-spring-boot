package com.eric.diveinspringboot.annotation;

import java.lang.annotation.*;

/**
 * 2nd level {@link Repository}
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
