package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.AbstractDecorator;

import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ExampleTwo.Components.BaseCPU;

/**
 * Mantiene una referencia al componente asociado
 * hereda la superclase componente delegando en el componente
 * asociado
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
