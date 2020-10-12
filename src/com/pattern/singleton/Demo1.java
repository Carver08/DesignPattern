package com.pattern.singleton;
/**
 * 懒汉式--线程不安全 
 * @version [版本号, 2020年10月12日]
 */
public class Demo1{
    
    private static Demo1 instance;
    
    private Demo1() {
        System.out.println("创建了一次Demo1对象");
    }
    
    public static Demo1 getInstance() {
        
        if(instance == null) {
            instance =  new Demo1();
        }
        return instance;
    }
}
