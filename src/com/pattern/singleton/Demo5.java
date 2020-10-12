package com.pattern.singleton;

/**
 * 基于懒汉式的双端检锁机制 
 * @version [版本号, 2020年10月12日]
 */
public class Demo5{
    
    private static volatile Demo5 instance = null;
    
    private Demo5() {
        System.out.println("创建了一次Demo5对象");
    }
    
    public static Demo5 getInstance() {
        
        if(instance ==  null) {
            synchronized (Demo5.class) {
                if(instance == null) {
                    instance = new Demo5();
                }
            }
        }
        return instance;
    }

}
