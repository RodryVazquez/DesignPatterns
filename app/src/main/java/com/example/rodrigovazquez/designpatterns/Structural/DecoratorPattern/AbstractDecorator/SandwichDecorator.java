package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.AbstractDecorator;

import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.Sandwich;

/**
 * Created by Rodry on 7/3/2017.
 */

public abstract class SandwichDecorator implements Sandwich {

    protected  Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    @Override
    public void make() {
        this.sandwich.make();
    }
}
