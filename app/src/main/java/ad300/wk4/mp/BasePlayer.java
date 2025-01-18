package ad300.wk4.mp;

public class BasePlayer implements MediaPlayer{

    @Override
    public void play(Media content) throws Exception {
        setState(BasePlayer.State.PLAY);
    }

    @Override
    public void pause() throws Exception {
        setState(BasePlayer.State.PAUSE);
    }

    @Override
    public void stop() {
        setState(BasePlayer.State.STOP);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State state = BasePlayer.State.UNDEFINED;

    public enum State {
        PLAY, PAUSE, STOP, UNDEFINED

    }
}
