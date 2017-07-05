package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.ConcreteDecorators;

import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.AbstractDecorator.AbstractPcDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.Components.BaseCPU;

/**
 * Añade responsabilidades al componente.
 */

public class GamerFanDecorator extends AbstractPcDecorator {

    public GamerFanDecorator(BaseCPU baseCPU) {
        super(baseCPU);
    }

    @Override
    public String basePrice() {
        return super.basePrice() + " + " + priceGamerFan();
    }

    @Override
    public String priceBasePolicy() {
        return super.priceBasePolicy();
    }

    //Precio extra del fan
    private String priceGamerFan(){
        return "$25.00";
    }

    //Obtiene el nuevo precio del PC
    public String getNewPrice(){
        return basePrice();
    }
}
