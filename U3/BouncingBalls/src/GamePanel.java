import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GamePanel extends JPanel implements ActionListener {

    KeyInput keyInput;
    ArrayList<Ball> balls;
    Timer timer;

    public GamePanel() {

        keyInput = new KeyInput();
        balls = new ArrayList<>();
        timer = new Timer(1000 / 60, this);

        timer.start();

        balls.add(new Ball());

        setPreferredSize(new java.awt.Dimension(800, 600));

        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(keyInput);
    }

    public void update(){

        if (keyInput.e){
            balls.add(new Ball());
        }

        for (Ball ball : balls) {
            ball.update();
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for(Ball ball : balls) {
            ball.draw(g2);
        }

        g2.dispose();
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        update();
        repaint();
    }
}
