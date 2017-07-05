package com.example.rodrigovazquez.designpatterns.Structural.DecoratorPattern;

/**
 * Created by Rodry on 7/3/2017.
 */

public class BigSandwich implements Sandwich {
    @Override
    public void make() {
        System.out.println("This is a Big sandwich");
    }
}
