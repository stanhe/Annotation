package com.example.UseCase;

/**
 * Created by stan on 2017/3/10.
 */
public class Annotation {

    @UseCase(id= 14,description = "print someThing!")
    public static void print(String message) {
        System.out.println("message : "+message);
    }

    @UseCase(id= 18)
    public static void password(String message) {
        System.out.println("message : "+message);
    }
    @UseCase(id= 10,description = "input your name!")
    public static void name(String message) {
        System.out.println("message : "+message);
    }
}
