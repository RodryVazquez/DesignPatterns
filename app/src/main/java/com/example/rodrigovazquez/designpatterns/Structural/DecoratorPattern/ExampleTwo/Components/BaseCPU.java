package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.Components;

/**
 * Clase abstracta Componente para los objetos que pueden
 * tener responsabilidades añadidas
 */

public abstract class BaseCPU implements IPolicy {

    private String getCPUCode = "123456789";

    private String getGetCPUCode(){
        return this.getCPUCode;
    }

    public abstract String basePrice();
}
