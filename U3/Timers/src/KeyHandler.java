import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean keyPress = false;

    @Override
    public void keyPressed(KeyEvent e) {
        keyPress = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyPress = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
