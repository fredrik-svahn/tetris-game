import java.awt.*;

public class Board {
    public Point position;
    public Dimension size;
    public Dimension tileSize;

    public Point getTilePosition(Point point) {
        int x = point.x * tileSize.width + position.x;
        int y = point.y * tileSize.height + position.y;

        return new Point(x, y);
    }
}
