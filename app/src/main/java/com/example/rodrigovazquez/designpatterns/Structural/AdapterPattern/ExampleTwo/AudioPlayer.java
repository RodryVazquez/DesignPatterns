package com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo;

import com.example.rodrigovazquez.designpatterns.Structural.AdapterPattern.ExampleTwo.Adapter.MediaAdapter;

/**
 * Created by RodryVazquez on 03/07/17.
 */

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void Play(String mediaFormat, String file) {
        if(mediaFormat.equalsIgnoreCase(".mp3")){
            System.out.println("Playing .MP3");
        }else if(mediaFormat.equalsIgnoreCase(".vlc") || mediaFormat.equalsIgnoreCase(".mp4")){
            mediaAdapter = new MediaAdapter(mediaFormat);
            mediaAdapter.Play(mediaFormat, file);
        }else{
            System.out.println("Incorrect format media");
        }
    }
}
