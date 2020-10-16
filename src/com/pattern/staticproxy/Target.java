package com.pattern.staticproxy;

public class Target implements Service{

    @Override
    public void m1() {
        System.out.println("this is target m1()......");
    }

    @Override
    public void m2() {
        System.out.println("this is target m2()......");
        
    }

    @Override
    public void m3() {
        System.out.println("this is target m3()......");
        
    }

}
