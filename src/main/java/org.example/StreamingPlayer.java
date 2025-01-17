package org.example;

public class StreamingpLayer implements MediaPlayer{
    
    @Override
    public play(){
        System.out.println("Playing stream now");
    }

    @Override
    public pause(){
        System.out.println("Streaming paused");
    }

    @Override
    public stop(){
        System.out.println("Stream stopped");
    }

}