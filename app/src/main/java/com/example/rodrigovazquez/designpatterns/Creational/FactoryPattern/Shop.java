package com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern;

/**
 * Created by Rodrigo Vazquez on 06/06/2017.
 */

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new SearchPage());
    }
}
