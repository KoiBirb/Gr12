/*
 * KeyInput.java
 * Leo Bogaert
 * April 4, 2025
 * Listens for and handles key input for the program
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

    // key input variables
    public boolean q,a,b,p;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * Handles key pressed events
     * @param e the key event
     */
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_A) {
            this.a = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_Q) {
            this.q = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_B) {
            this.b = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_P) {
            this.p = true;
        }

    }

    /**
     * Handles key released events
     * @param e the key event
     */
    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_A) {
            this.a = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_Q) {
            this.q = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_B) {
            this.b = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_P) {
            this.p = false;
        }
    }
}
