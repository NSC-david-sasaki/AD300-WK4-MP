package ad300.wk4.mp;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AudioPlayerTest {
    @Test
    void testPause() {
        AudioPlayer ap = new AudioPlayer();
        try {
            ap.pause();
            assertThrows(Exception.class, () -> ap.pause());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
