package com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern;

import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.Enums.BrandType;

/**
 * Factory para crear objetos referentes a Car
 */

public class FactoryCar extends AbstractFactory {

    @Override
    public Car getCarType(BrandType brand) {
        switch (brand){
            case AVEO:
                return new Aveo();
            case NEON:
                return new Neon();
            default:{
                return null;
            }
        }
    }
}
