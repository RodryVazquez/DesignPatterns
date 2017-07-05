package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.ConcreteDecorators;

import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.AbstractDecorator.AbstractPcDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.Components.BaseCPU;

/**
 * Añade responsabilidades al componente.
 */

public class GamerRamDecorator extends AbstractPcDecorator {

    public GamerRamDecorator(BaseCPU baseCPU) {
        super(baseCPU);
    }

    @Override
    public String basePrice() {
        return super.basePrice() + " + " + priceRam();
    }

    @Override
    public String priceBasePolicy() {
        return super.priceBasePolicy();
    }

    private String priceRam(){
        return "$250.00";
    }

    public String getNewPrice(){
        return basePrice();
    }
}
