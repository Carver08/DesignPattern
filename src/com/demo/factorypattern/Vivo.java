package com.demo.factorypattern;

public class Vivo implements MakePhone{

    @Override
    public void make() {
        System.out.println("生产了一台vivo手机");
    }
}
