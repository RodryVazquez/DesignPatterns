package com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern;

/**
 * Productor del Abstract Factory
 */

public class FactoryProducer {

    /**
     * Retorna un Factory con base a su nombre
     * @param factoryName
     * @return
     */
    public static AbstractFactory getFactory(String factoryName){
        //TO DO definir mas factory
        return  new FactoryCar();
    }
}
