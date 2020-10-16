package com.pattern.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKDynamicProxyDemo{
    
    public static void main(String[] args) {
        
        MyService myTarget = new MyTarget();
        InvocationHandler myProxy = new MyProxy(myTarget);
        
        /**
         * newProxyInstance三个参数的含义：
         *      第一个：代理类的类加载器
         *      第二个：被代理类的接口
         *      第三个：代理类实例
         */
        MyService newProxyInstance = (MyService)Proxy.newProxyInstance(
                myProxy.getClass().getClassLoader(),
                myTarget.getClass().getInterfaces(),
                myProxy);
        
        newProxyInstance.hello("world");
    }

}
