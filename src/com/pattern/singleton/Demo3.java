package com.pattern.singleton;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *  静态内部类 --线程安全
 * @version [版本号, 2020年10月12日]
 */
public class Demo3{
    
    private Demo3() {
        System.out.println("创建了一个Demo3对象");
    }
    
    private static class SingletonHolder {
        public static final Demo3 INSTANCE = new Demo3();
    }
    
    public static final Demo3 getInstance() {
        return SingletonHolder.INSTANCE;  
    }

}
