package ad300.wk4.mp;

public interface MediaPlayer{
    void play(Media content) throws Exception;
    void pause();
    void stop();
    public enum State {
        PLAY, PAUSE, STOP, UNDEFINED

    }

}