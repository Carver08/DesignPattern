package com.pattern.staticproxy;

/**
 * 这种模式的关键：真正的目标对象和代理对象得实现同一个接口，同时代理对象中要注入一个目标对象的引用，
 * 调用代理对象之后，代理对象内部调用目标对象 
 * @version [版本号, 2020年10月16日]
 */
public class StaticProxyDemo{
    
    public static void main(String[] args) {
        Service target=new Target();
        Service proxy=new Proxy(target);
        proxy.m1();
        proxy.m2();
        proxy.m3();
    }

}
