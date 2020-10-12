package com.pattern.singleton;

public enum Demo4{
    
    INSTANCE;
    
    public void whateverMethod(){
        System.out.println("枚举类型实现单例模式！"+this.hashCode());
    }
    
    private Demo4() {
        System.out.println("创建了一次Demo4对象");
    }

}
