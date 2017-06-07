package com.example.rodrigovazquez.designpatterns.FactoryPattern;

/**
 * Created by Rodrigo Vazquez on 06/06/2017.
 */

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
        pages.add(new CommentPage());
    }
}
