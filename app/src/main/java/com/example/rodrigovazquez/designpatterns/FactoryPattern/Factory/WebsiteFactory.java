package com.example.rodrigovazquez.designpatterns.FactoryPattern.Factory;

import com.example.rodrigovazquez.designpatterns.FactoryPattern.Blog;
import com.example.rodrigovazquez.designpatterns.FactoryPattern.Enums.WebsiteType;
import com.example.rodrigovazquez.designpatterns.FactoryPattern.Shop;
import com.example.rodrigovazquez.designpatterns.FactoryPattern.Website;

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
