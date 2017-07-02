package com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern;

import com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern.Enums.BrandType;

/**
 * Abstract factory
 */

public abstract class AbstractFactory {

    //Car Factory
    public abstract Car getCarType(BrandType brand);
}
