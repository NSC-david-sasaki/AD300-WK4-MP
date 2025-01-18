package ad300.wk4.mp;

public interface MediaPlayer{
    void play(Media content) throws Exception;
    void pause() throws Exception;
    void stop();
}