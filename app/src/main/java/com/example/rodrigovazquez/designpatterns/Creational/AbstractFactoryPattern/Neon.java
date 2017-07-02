package com.example.rodrigovazquez.designpatterns.Creational.AbstractFactoryPattern;

/**
 * Clase concreta
 */

public class Neon extends Car {

    @Override
    public int getFabricationYear() {
        return 1994;
    }

    @Override
    public String getGeneralBrand() {
        return "Chrysler";
    }

    @Override
    public boolean Start() {
        return false;
    }

    @Override
    public boolean Stop() {
        return true;
    }

    @Override
    public String StartEngine() {
        return "The car not start!!!";
    }
}
