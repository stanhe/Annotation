package com.example.Null;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by stan on 2017/3/12.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@DefaultNull
public @interface Simple {
    DefaultNull getDefault() default @DefaultNull(value = 2);
}
