package com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Factory;

import com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Blog;
import com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Enums.WebsiteType;
import com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Shop;
import com.example.rodrigovazquez.designpatterns.Creational.FactoryPattern.Website;

/**
 * Factory
 */

public class WebsiteFactory {

    /**
     *
     * @param siteType
     * @return
     */
    public static Website getWebsite(WebsiteType siteType){
        switch (siteType){
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:{
                return  null;
            }
        }
    }
}
