/*
 * Main.java
 * Leo Bogaert
 * April 4, 2025
 * Runnable class that creates the JFrame and GamePanel
 */

import javax.swing.*;

public class Main {

    public static GamePanel gamePanel;

    public static void main(String[] args) {

        // initialize frame
        JFrame frame = new JFrame();

        gamePanel = new GamePanel();

        //setup settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Leo Bogaert Assigment");

        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}