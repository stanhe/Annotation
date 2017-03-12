package com.example.Test;

/**
 * Created by stan on 2017/3/11.
 */
public class Test {
    {
        InjectUtil.inject(this);
    }

    @TaidiAnnotation
    public Dog dog1;
    @JiwawaAnnotation
    public Dog dog2;

    public void liuGou() {
        System.out.println("dog1.action : "+dog1.action);
        System.out.println("dog2.action : "+dog2.action);
    }

    public static void main(String[] args) {
       Test test = new Test();
        test.liuGou();
    }
}
