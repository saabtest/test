
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        assertTrue(frame.getCountOfNumbers() > 4 && frame.getCountOfNumbers() < 30);
        assertTrue(frame.getNumbersCollection().getSize() == frame.getCountOfNumbers());
    }

    @After
    public void tearDown() {
        frame = null;
    }
}
