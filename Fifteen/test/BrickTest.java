
import javax.swing.JComponent;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import project.Brick;
import project.Game;

/**
 *
 * @author Lubor Pesek
 */
public class BrickTest {

    private Brick brick, fakeBrick;
    private JFrame frame;

    @Before
    public void setUp() {
        brick = new Brick("1");
        fakeBrick = new Brick("");
        fakeBrick.setSize(51, 51);

        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(brick.getWidth() * 3, brick.getHeight() * 3);
        frame.setLayout(null);
    }

    /**
     * Integration and validation test of two bricks
     */
    @Test
    public void test1() {
        assertTrue(brick instanceof JComponent);
        assertTrue(brick.getWidth() == 50 && brick.getHeight() == 50);
        assertNotNull(brick.getName());

        assertTrue(fakeBrick instanceof JComponent);
        assertFalse(fakeBrick.getWidth() == 50 && fakeBrick.getHeight() == 50);

    }

    /**
     * Testing movable brick
     */
    @Test
    public void test2() {
        frame.add(brick);
        assertTrue(brick.getX() == 0 && brick.getY() == 0);
        brick.moveRight();
        assertTrue(brick.getX() == Game.getBrickWidth() && brick.getY() == 0);
        brick.moveLeft();
        assertTrue(brick.getX() == 0 && brick.getY() == 0);
        brick.moveDown();
        assertTrue(brick.getX() == 0 && brick.getY() == Game.getBrickHeight());
        brick.moveUp();
        assertTrue(brick.getX() == 0 && brick.getY() == 0);
    }

    /**
     * Testing if is a brick movable (just return true or false value)
     */
    @Test
    public void test3() {
        brick.setLocation(0, 0);
        Game.getGame().setParametersOfEmptyPlace(0, 0);
        assertTrue(Game.getGame().isBrickEnableToMove(brick.getX(), brick.getY()));
        Game.getGame().setParametersOfEmptyPlace(50, 0);
        assertTrue(Game.getGame().isBrickEnableToMove(brick.getX(), brick.getY()));
        Game.getGame().setParametersOfEmptyPlace(0, 50);
        assertTrue(Game.getGame().isBrickEnableToMove(brick.getX(), brick.getY()));
        Game.getGame().setParametersOfEmptyPlace(50, 50);
        assertFalse(Game.getGame().isBrickEnableToMove(brick.getX(), brick.getY()));
    }

    @After
    public void tearDown() {
        brick = null;
        fakeBrick = null;

        frame = null;
    }
}
