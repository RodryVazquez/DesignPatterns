package com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern;

/**
 * Factory para crear objetos referentes a Car
 */

public class FactoryCar extends AbstractFactory {

    @Override
    public Car getCarType(String brand) {
        switch (brand){
            case "Aveo":
                return new Aveo();
            case "Neon":
                return new Neon();
            default:{
                return null;
            }
        }
    }
}
