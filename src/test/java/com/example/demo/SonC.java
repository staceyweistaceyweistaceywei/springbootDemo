package com.example.demo;

/**
 * created by wyx on 2019/9/17
 */
public class SonC extends SuperC {

    int aa = 0;

    {
        int bb = 1;
        aa+=1;
        System.out.println("SonC static aa="+aa);
        System.out.println("SonC static  bb="+bb);
    }

    public SonC() {
        aa+=1;
        System.out.println("SonC constructor aa="+aa);
    }

}
