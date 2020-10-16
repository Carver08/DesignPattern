package com.pattern.jdkdynamicproxy;

public class MyTarget implements MyService{

    @Override
    public void hello(String param) {
        System.out.println("hello"+ param);
    }

}
