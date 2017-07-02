package com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base
 */

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();
}
