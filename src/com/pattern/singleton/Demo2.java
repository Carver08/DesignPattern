package com.pattern.singleton;
/**
 * 饿汉式 -- 线程安全 
 * @version [版本号, 2020年10月12日]
 */
public class Demo2{
    
    private static final Demo2 INSTANCE = new Demo2();
    
    private Demo2() {
        System.out.println("创建了一次Demo2对象");
    }

    public static Demo2 getInstance() {
        return INSTANCE;
    }
    
}
