package com.pattern.abstractfactory;

public class ShapeFactory extends AbstractFactory{
    
    public Shape getShape(String shape) {
        
        if("rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        }
        if("round".equalsIgnoreCase(shape)) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
