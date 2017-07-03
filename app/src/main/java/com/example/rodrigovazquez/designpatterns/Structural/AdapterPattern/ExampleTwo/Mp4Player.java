package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo;

/**
 * Created by RodryVazquez on 03/07/17.
 */

public class Mp4Player implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String file) {
        //TODO
    }

    @Override
    public void playMP4(String file) {
        System.out.println("Playing .MP4");
    }
}
