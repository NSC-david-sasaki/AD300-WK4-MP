package ad300.wk4.mp;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AudioPlayerTest {
    private AudioPlayer ap;
    private Media content; 

    @BeforeEach
    void setUp(){
        ap = new AudioPlayer();
        content = new Media("Dark Side of the Moon", 1997, Media.Format.VINYL, Media.ContentProvider.PRIVATECOLLECTION);
    }
    
    @AfterEach
    void tearDown(){
        ap = null;
        System.gc();
        System.setOut(System.out);
    }

    @Test
    void testPlay(){   
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); 
        try {
            ap.play(content);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        String output = outputStream.toString();
        String[] lines = output.split(System.lineSeparator()); // capature multi line output
        assertTrue(lines[0].contains("Audio playing"), "Expected 'Audio playing' to be in the output");
        assertTrue(lines[1].contains("TITLE: Dark Side of the Moon"), "Expected title to be in the output");
        assertTrue(lines[2].contains("FORMAT: VINYL"), "Expected format to be in the output");
        assertDoesNotThrow(() -> this.ap.play(this.content));
    }

    @Test
    void testPause(){
        try {
            ap.play(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertDoesNotThrow(() -> this.ap.pause());
        assertThrows(Exception.class, () -> this.ap.pause()); // cannot pause from existing pause state

    }

    @Test
    void testStop(){
        try {
            ap.play(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertDoesNotThrow(() -> this.ap.stop());
        assertDoesNotThrow(() -> this.ap.stop()); // repeated calls to stop do nothing
    }

    @Test
    void testPauseMissingMedia() {
        try {
            assertThrows(Exception.class, () -> ap.pause()); // Media was never played
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testPlayNull() {
        
        try {
            assertThrows(Exception.class, () -> ap.play(null)); // null content
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testPlayMismatchedMedia() {
        Media content0 = new Media("PBS News Hour", 2025, Media.Format.STREAM, Media.ContentProvider.PBS);
        try {
            assertThrows(Exception.class, () -> ap.play(content0)); // mismatched STREAM content with Audio Player
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
