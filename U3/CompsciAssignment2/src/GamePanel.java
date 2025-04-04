/*
 * GamePanel.java
 * Leo Bogaert
 * April 4, 2025
 * Main JPanel handles updating and drawing of balls and UI
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GamePanel extends JPanel implements ActionListener {

    // Declare classes and list
    KeyInput keyInput;
    Timer timer;
    ArrayList<Ball> balls;

    // if program should be paused
    boolean pause;

    /**
     * Constructor for GamePanel
     */
    public GamePanel() {
        keyInput = new KeyInput();
        balls = new ArrayList<>();
        timer = new Timer(1000 / 60, this);

        pause = false;

        timer.start();

        setPreferredSize(new java.awt.Dimension(800, 600));

        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(keyInput);
    }

    /**
     * Update method for the game panel
     * Handles key input and updates the balls if not paused
     */
    public void update(){

        if (keyInput.q){
            System.exit(0);
        }

        if (keyInput.a){
            balls.add(new Ball());
        }

        if (keyInput.b){
            if (!balls.isEmpty())
                balls.removeLast();
        }

        if (keyInput.p){
            pause = !pause;
        }

        if (!pause) {
            for (Ball ball : balls) {
                ball.update();
            }
        }
    }

    /**
     * Paint method for the game panel
     * Draws the balls and UI
     * @param g Graphics object to draw with
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for(Ball ball : balls) {
            ball.draw(g2);
        }

        g2.setColor(Color.WHITE);

        g2.drawString("Press 'A' to add a ball, 'B' to remove ball", 10, 20);
        g2.drawString("Press 'P' to pause/unpause, 'Q' to Quit", 10, 40);

        g2.dispose();
    }

    /**
     * Game clock
     * Calls update and repaint methods
     * @param e ActionEvent object
     */
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        update();
        repaint();
    }
}
