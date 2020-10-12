package com.pattern.abstractfactory;

public class Round implements Shape{

    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }

}
