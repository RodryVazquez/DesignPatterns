package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.ExampleTwo.ConcreteDecorators;

import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.ExampleTwo.AbstractDecorator.AbstractPcDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.ExampleTwo.BaseCPU;

/**
 * Created by Rodry on 7/4/2017.
 */

public class GamerFanDecorator extends AbstractPcDecorator {

    public GamerFanDecorator(BaseCPU baseCPU) {
        super(baseCPU);
    }

    @Override
    public String basePrice() {
        return super.basePrice();
    }

    @Override
    public String priceBasePolicy() {
        return super.priceBasePolicy() + " " + priceGamerFan();
    }

    //Precio extra del fan
    private String priceGamerFan(){
        return "$25.00";
    }
}
