package com.pattern.cglibdynamicproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyMethodInterceptor implements MethodInterceptor{

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("-----执行方法之前------");
        Object object = proxy.invokeSuper(obj,args);
        System.out.println("-----执行方法之后------");
        return object;
    }

}
