package com.pattern.factory;

public class HuaWei implements MakePhone{

    @Override
    public void make() {
        System.out.println("生产了一台华为手机");
    }

}
