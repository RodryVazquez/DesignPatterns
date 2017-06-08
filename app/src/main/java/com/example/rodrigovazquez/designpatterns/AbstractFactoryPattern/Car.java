package com.example.rodrigovazquez.designpatterns.AbstractFactoryPattern;

/**
 * Clase base
 */

public abstract class Car {

    public String getGeneralBrand(){
        return "General Motors";
    }

    public int getFabricationYear(){
     return 1950;
    }

    public abstract boolean Start();

    public abstract boolean Stop();

    public abstract String StartEngine();
}
