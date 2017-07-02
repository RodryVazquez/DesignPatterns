package com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern;

import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.Enums.FactoryType;

/**
 * Productor del Abstract Factory
 */

public class FactoryProducer {

    /**
     * Retorna un Factory con base a su nombre
     * @param type
     * @return
     */
    public static AbstractFactory getFactory(FactoryType type){
        //TO DO definir mas factory
        return  new FactoryCar();
    }
}
