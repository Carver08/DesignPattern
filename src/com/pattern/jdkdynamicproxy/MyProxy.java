package com.pattern.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.pattern.staticproxy.Service;

public class MyProxy implements InvocationHandler{

    private MyService myService;
    
    public MyProxy(MyService myService) {
        this.myService = myService;
    }
    /**
     * invoke方法中的三个参数
     *      第一个参数：生成的代理对象   
     *      第二个参数：某一个接口中的方法 
     *      第三个参数：参数   
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------------begin---------------");
        Object invoke = method.invoke(myService, args);//利用反射调用类中的实际方法
        System.out.println("----------------end----------------");
        return invoke;
    }

}
