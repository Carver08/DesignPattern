package com.pattern.factory;

public class XiaoMi implements MakePhone{

    @Override
    public void make() {
        System.out.println("生产了一台小米手机");
    }

}
