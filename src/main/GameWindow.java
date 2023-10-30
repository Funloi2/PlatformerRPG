package main;

import javax.swing.*;

public class GameWindow {

    //region Fields
    private JFrame jFrame;

    //endregion

    //region Constructors
    public GameWindow(GamePanel gamePanel) {

        //region JFrame basics
        jFrame = new JFrame("Game Window");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);

        jFrame.setVisible(true);

        //endregion
    }

    //endregion
}
