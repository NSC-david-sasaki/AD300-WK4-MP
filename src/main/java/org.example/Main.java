package org.example;

public class Main {
    public static void main(String[] args) {
        MediaPlayer[] mp = new MediaPlayer[3];
        // String title, int produceOn, Format contentFormat, ContentProvider c
        Media content0 = new Media("Big Lebowski", 1997, BLURAY, AMAZON);
        mp[0] = new AudioPlayer();
        mp[1] = new VideoPlayer();
        mp[2] = new StreamingPlayer();

        for (MediaPlayer player : mp){
            player.play();
            palyer.pause();
            player.stop();
        }
    }
}