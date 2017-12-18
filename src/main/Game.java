package main;

import ent.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends JPanel {
    private boolean running;
    private JFrame frame;

    private Board board;

    public static double currentTime;
    public static double pastTime;




    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Tetris");
        f.setSize(new Dimension(1920,1080));

        Game game = new Game(f);
        game.start();
    }

    public Game(JFrame frame) {
        currentTime = System.currentTimeMillis();
        pastTime = System.currentTimeMillis();

        board = new Board();

        board.setY(50);
        board.setWidth(500);
        board.setHeight(800);
        board.setTileWidth(20);
        board.setTileHeight(20);

        frame.setVisible(true);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        this.frame = frame;
    }

    public void start() {
        running = true;
        run();
    }

    public void run() {
        double deltaTime = 0;
        while(running) {
            currentTime = System.currentTimeMillis();
            deltaTime += getDeltaTime();

            if(deltaTime > 50) {
                update();
                render();
                deltaTime -= 50;
            }

            pastTime = currentTime;

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static double getDeltaTime() {
        return currentTime - pastTime;
    }

    public void render() {
        BufferStrategy bs;
        bs = frame.getBufferStrategy();

        if(bs == null) {
            frame.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0,0 ,getWidth(), getHeight());

        board.render(g);

        g.dispose();
        bs.show();

    }

    public void update() {
        // board.setWidth(getWidth());
        // board.setHeight(getHeight());
        board.setX((getWidth() - board.getWidth()) / 2);
    }
}
