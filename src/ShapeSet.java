import java.util.Collections;
import java.util.LinkedList;

public class ShapeSet {
    private LinkedList<Shape> shapes;

    public ShapeSet() {
        shapes = new LinkedList<>();
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public int size() {
        return shapes.size();
    }

    public LinkedList<Shape> getShapes() {
        return shapes;
    }

    public void shuffle() {
        Collections.shuffle(shapes);
    }
}
