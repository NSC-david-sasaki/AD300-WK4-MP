package org.example;
public class AudioPlayer implements MediaPlayer{
    
    @Override
    public play(){
        System.out.println("Playing audio now");
    }

    @Override
    public pause(){
        System.out.println("Audio paused");
    }

    @Override
    public stop(){
        System.out.println("Audio stopped");
    }

}