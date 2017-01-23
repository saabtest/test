
import java.util.Iterator;
import static javax.management.Query.value;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import project.*;

/**
 *
 * @author Lubor Pesek
 */
public class FrameTest {

    private Frame frame;

    @Before
    public void setUp() {
        frame = new Frame();
    }

    /**
     * Testing visual optimalizing of frame
     */
    @Test
    public void test1() {
        assertTrue(frame instanceof JFrame);
        assertTrue(frame.isVisible());
        assertTrue(frame.getWidth() > 100);
        assertTrue(frame.getHeight() > 100);
    }

    /**
     * Testing frame atributes
     */
    @Test
    public void test2() {
        assertTrue(Game.getCountOfNumbers() > 4 && Game.getCountOfNumbers() < 30);
        assertTrue(frame.getBricksCollection().size() == Game.getCountOfNumbers());
    }

    /**
     * Testing names of bricks
     */
    @Test
    public void test3() {
        int number = 1;
        for (Brick brick : frame.getBricksCollection()) {
            assertTrue(brick.getName().equals(String.valueOf(number)));
            number++;
        }
    }

    @After
    public void tearDown() {
        frame = null;
    }
}
