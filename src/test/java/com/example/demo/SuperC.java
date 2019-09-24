package com.example.demo;

/**
 * created by wyx on 2019/9/17
 */
public class SuperC {
    int a = 0;

    {
        int b = 1;
        a = a+1;
        System.out.println("static a="+a);
        System.out.println("static  b="+b);
    }

    public SuperC() {
        a = a+1;
        System.out.println("constructor a="+a);
    }
}
