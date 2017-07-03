package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.Adapter;

import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.AdvancedMediaPlayer;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.MediaPlayer;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.Mp4Player;
import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.VlcPlayer;

/**
 * Created by RodryVazquez on 03/07/17.
 */

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaFormat) {
        if(mediaFormat.equalsIgnoreCase(".vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(mediaFormat.equalsIgnoreCase(".mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void Play(String mediaFormat, String file) {
        if(mediaFormat.equalsIgnoreCase(".vlc")){
            advancedMediaPlayer.playVlc(file);
        }else if(mediaFormat.equalsIgnoreCase(".mp4")){
            advancedMediaPlayer.playMP4(file);
        }
    }
}
