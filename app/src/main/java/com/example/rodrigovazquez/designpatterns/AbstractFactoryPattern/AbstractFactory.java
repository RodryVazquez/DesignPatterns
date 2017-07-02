package com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern;

import com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern.Enums.BrandType;

/**
 * Abstract factory
 */

public abstract class AbstractFactory {

    //Car Factory
    public abstract Car getCarType(BrandType brand);
}
