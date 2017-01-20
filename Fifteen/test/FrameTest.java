
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
        assertTrue(Frame.getCountOfNumbers() > 4 && Frame.getCountOfNumbers() < 30);
        assertTrue(frame.getBricksCollection().size() == Frame.getCountOfNumbers());
    }

    @After
    public void tearDown() {
        frame = null;
    }
}
