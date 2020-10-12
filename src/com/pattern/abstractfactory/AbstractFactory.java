package com.pattern.abstractfactory;

public abstract class AbstractFactory {
    
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
    
}