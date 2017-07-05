package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.ConcreteDecorators;

import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.AbstractDecorator.SandwichDecorator;
import com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern.Sandwich;

/**
 * Created by Rodry on 7/3/2017.
 */

public class BagetteDecorator extends SandwichDecorator {

    /**
     *
     * @param sandwich
     */
    public BagetteDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    /**
     *
     */
    @Override
    public void make() {
        sandwich.make();
        //Agregamos funcionalidad
        setIngredient(sandwich);
    }

    /**
     *
     * @param sandwich
     */
    private void setIngredient(Sandwich sandwich){
        System.out.println("This ingredient is for Bagette Decorator");
    }
}
