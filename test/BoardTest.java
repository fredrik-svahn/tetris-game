import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class BoardTest {
    private Board board;

    @Before
    public void setup() {
        board = new Board();
        board.size = new Dimension(500, 500);
        board.tileSize = new Dimension(10,10);
        board.position = new Point(0, 0);
    }

    @Test
    public void getTilePositionShouldReturnCorrectPosition() {
        Point position = board.getTilePosition(new Point(5, 5));
        assertEquals(50, position.x);
        assertEquals(50, position.y);
    }

}