import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timer tp = new timer();

        frame.add(tp);
        frame.pack();
        frame.setVisible(true);

    }
}