import javax.swing.*;

public class Main {

    public static GamePanel gamePanel;

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        gamePanel = new GamePanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bouncing Balls");

        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}