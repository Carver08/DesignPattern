package com.pattern.singleton;

public class SingletonDemo{
    
    public static void main(String[] args) {
        
        //测试
        for (int i = 0; i < 1000; i++) {
            new Thread(()-> {
                Demo5.getInstance();
            }).start();;  
        }
        
        //测试Demo4
        for (int i = 0; i < 1000; i++) {
            new Thread(()-> {
                Demo4.INSTANCE.whateverMethod();;
            }).start();;  
        }
        
        
    }

}
