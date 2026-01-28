package com.customannotations.basiclevel.markimportantmethods;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod {
    String level() default "HIGH";
}