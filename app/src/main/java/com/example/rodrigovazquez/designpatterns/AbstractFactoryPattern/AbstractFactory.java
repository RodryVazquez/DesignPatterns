package com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern;

/**
 * Abstract factory
 */

public abstract class AbstractFactory {

    //Car Factory
    public abstract Car getCarType(String brand);
}
