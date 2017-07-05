package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.ConcreteComponents;

import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.Components.BaseCPU;

/**
 * Componente concreto al cual se le pueden agregar
 * responsabilidades adicionales
 */

public class BasicPc extends BaseCPU {
    @Override
    public String priceBasePolicy() {
        return "$100.00";
    }

    @Override
    public String basePrice() {
        return "$5500.00";
    }
}
