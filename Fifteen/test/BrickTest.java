
import javax.swing.JComponent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import project.Brick;

/**
 *
 * @author Lubor Pesek
 */
public class BrickTest {

    private Brick brick, fakeBrick;

    @Before
    public void setUp() {
        brick = new Brick("1");
        fakeBrick = new Brick("");
        fakeBrick.setSize(51, 51);
    }

    /**
     *
     */
    @Test
    public void test1() {
        assertTrue(brick instanceof JComponent);
        assertTrue(brick.getWidth() == 50 && brick.getHeight() == 50);
        assertNotNull(brick.getName());

        assertTrue(fakeBrick instanceof JComponent);
        assertFalse(fakeBrick.getWidth() == 50 && fakeBrick.getHeight() == 50);

    }

    @After
    public void tearDown() {
    }
}
