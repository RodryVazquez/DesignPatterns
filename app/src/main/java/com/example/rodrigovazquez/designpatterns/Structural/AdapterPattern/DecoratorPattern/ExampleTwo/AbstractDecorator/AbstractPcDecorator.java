package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.ExampleTwo.AbstractDecorator;

import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.DecoratorPattern.ExampleTwo.BaseCPU;

/**
 * Created by Rodry on 7/4/2017.
 */

public abstract class AbstractPcDecorator extends BaseCPU {

    protected BaseCPU baseCPU;

    public AbstractPcDecorator(BaseCPU baseCPU) {
        this.baseCPU = baseCPU;
    }

    @Override
    public String priceBasePolicy() {
        return this.baseCPU.priceBasePolicy();
    }

    @Override
    public String basePrice() {return this.baseCPU.basePrice();}
}
