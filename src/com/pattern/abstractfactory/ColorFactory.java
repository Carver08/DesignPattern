package com.pattern.abstractfactory;

public class ColorFactory extends AbstractFactory{
    
    @Override
    public Shape getShape(String shape) {
        return null;
    }
    public Color getColor(String color) {
        
        if("red".equalsIgnoreCase(color)) {
           return new Red();
        }
        if("green".equalsIgnoreCase(color)) {
            return new Green();
        }
        return null;
    }
}
