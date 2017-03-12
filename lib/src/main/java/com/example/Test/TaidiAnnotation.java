package com.example.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by stan on 2017/3/11.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@CategoryAnnotation(animalType = AnimalType.DOG, name ="Tai-di" )
public @interface TaidiAnnotation {
    int value() default -1;
}
