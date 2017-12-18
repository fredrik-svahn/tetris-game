package ent;

import java.awt.*;

public class Board {
    private int x;
    private int y;
    private int width;
    private int height;
    private int tileWidth;
    private int tileHeight;

    public Board() {

    }

    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawRect(x,y, width, height);
        int tilesY = height / tileHeight;
        int tilesX = width / tileWidth;

        for(int tileY = 0; tileY < tilesY; tileY++) {
            for(int tileX = 0; tileX < tilesX; tileX++) {
                g.drawRect(tileX * tileWidth + x, tileY * tileHeight + y, tileWidth, tileHeight);
            }
        }
    }

    public void renderAt(Graphics g, int tileX, int tileY) {
        g.setColor(Color.GREEN);
        g.fillRect(tileX * tileWidth + x, tileY * tileWidth + y, tileWidth, tileHeight);
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
