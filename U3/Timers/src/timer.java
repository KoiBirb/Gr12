import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class timer extends JPanel implements ActionListener {

    Timer time;
    JPanel panel;
    Font font;

    KeyHandler keyListener;

    int milliseconds;

    public timer () {
        this.panel = new JPanel();
        this.setPreferredSize(new Dimension(400, 400));

        time = new Timer(1, this);
        time.start();

        font = new Font("Times New Roman", Font.PLAIN, 30);

        keyListener = new KeyHandler();

        this.addKeyListener(keyListener);
    }

    private void update() {
        if (keyListener.keyPress){
            milliseconds = 0;
            time.restart();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        milliseconds++;
        update();
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setFont(font);
        g2.drawString(String.valueOf(milliseconds/1000), 200, 200);
    }
}
