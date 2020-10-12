package com.pattern.factory;

public class FactoryPatternDemo{
    
    public static void main(String[] args) {
        
        PhoneFactory phoneFactory = new PhoneFactory();
        
        //1-生产小米手机
        MakePhone xiaoMi = phoneFactory.makePhone("xiaomi");
        xiaoMi.make();
        
        //2-生产华为手机
        MakePhone huaWei = phoneFactory.makePhone("huawei");
        huaWei.make();
        
        //3-生产vivo手机
        MakePhone vivo = phoneFactory.makePhone("vivo");
        vivo.make();
    }

}
