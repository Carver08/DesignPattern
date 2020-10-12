package com.pattern.abstractfactory;

public class AbstractFactoryPatternDemo{
    
    public static void main(String[] args) {
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("round");
        shape.draw();
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.print();
    }
}
