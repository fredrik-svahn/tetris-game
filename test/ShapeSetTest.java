import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeSetTest {
    private ShapeSet shapeSet;

    @Before
    public void setup() {
        shapeSet = new ShapeSet();
    }

    @Test
    public void addTileShouldIncreaseSize() {
        int expectedSize = shapeSet.size();
        for(int i = 0; i < 50; i++) {
            shapeSet.add(new Shape());
            expectedSize++;
            assertEquals(expectedSize, shapeSet.size());
        }
    }
}