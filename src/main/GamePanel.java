package main;

import input.KeyboardInputs;
import input.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int yDelta = 100, xDelta = 100;

    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void serRectPos(int x, int y){
        this.yDelta = y;
        this.xDelta = x;
        repaint();
    }

    public void changeYDelta(int value){
        yDelta += value;
        repaint();
    }

    public void changeXDelta(int value){
        xDelta += value;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillRect(xDelta,yDelta,100,10);

    }
}
