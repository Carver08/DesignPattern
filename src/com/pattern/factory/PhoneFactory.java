package com.pattern.factory;

public class PhoneFactory{
    
    public  MakePhone makePhone(String phoneName) {
        
        if(phoneName.equals("xiaomi")) {
            return new XiaoMi();
        }
        
        if(phoneName.equals("huawei")) {
            return new HuaWei();
        }
        if(phoneName.equals("vivo")) {
            return new Vivo();
        }
        
        return null;
    }

}
