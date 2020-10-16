package com.pattern.staticproxy;

class Proxy implements Service{
    
    private Service target;
    
    public Proxy(Service target) {
        this.target=target;
    }
    
    @Override
    public void m1() {
        Long start=System.nanoTime();
        target.m1();
        Long end=System.nanoTime();
        System.out.println(end-start);
    }
    @Override
    public void m2() {
        Long start=System.nanoTime();
        target.m2();
        Long end=System.nanoTime();
        System.out.println(end-start);
    }
    @Override
    public void m3() {
        Long start=System.nanoTime();
        target.m3();
        Long end=System.nanoTime();
        System.out.println(end-start);
    }   
}
