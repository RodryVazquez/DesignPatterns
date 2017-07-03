package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo;

/**
 * Created by RodryVazquez on 03/07/17.
 */

public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String file) {
        System.out.println("Playing .VLC");
    }

    @Override
    public void playMP4(String file) {
        //TODO
    }
}
