package ad300.wk4.mp;

import ad300.wk4.mp.Media.Format;

public class Main {
    public static void main(String[] args) {
        MediaPlayer[] mp = new MediaPlayer[3];
        Media[] library = new Media[3];

        library[0] = new Media("Big Lebowski", 1997, Media.Format.BLURAY, Media.ContentProvider.AMAZON);
        library[1] = new Media("Dark Side of the Moon", 1997, Media.Format.VINYL, Media.ContentProvider.PRIVATECOLLECTION);
        library[2] = new Media("This Old House Season 1 Episode 1", 1976, Format.STREAM, Media.ContentProvider.PBS);
        mp[0] = new AudioPlayer();
        mp[1] = new VideoPlayer();
        mp[2] = new StreamingPlayer();

        for (MediaPlayer player : mp){
            for(Media content : library){
                try {
                    System.out.println("");
                    System.out.println(player.toString() + content.toString());
                    player.play(content);
                    player.pause();
                    player.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }    
            }
        }
    }

    public Object getGreeting() {
        return new String("Media Player Init");
    }
}