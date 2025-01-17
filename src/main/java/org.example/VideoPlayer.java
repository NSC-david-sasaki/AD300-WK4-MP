package org.example;
public class VideoPlayer implements MediaPlayer{
    
    @Override
    public play(Media content){
        System.out.println("Playing video now");
        System.out.println("TITLE: "+content.title());
        System.out.println("FORMAT: "+content.format());
    }

    @Override
    public pause(){
        System.out.println("Video paused");
    }

    @Override
    public stop(){
        System.out.println("Video stopped");
    }

}