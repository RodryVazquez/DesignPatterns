package com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern;

/**
 * Clase concreta
 */

public class Aveo extends Car {

    @Override
    public int getFabricationYear() {
        return 2008;
    }

    @Override
    public String getGeneralBrand() {
        return super.getGeneralBrand();
    }

    @Override
    public boolean Start() {
        return true;
    }

    @Override
    public boolean Stop() {
        return true;
    }

    @Override
    public String StartEngine() {
        return "Successfully Started";
    }
}
