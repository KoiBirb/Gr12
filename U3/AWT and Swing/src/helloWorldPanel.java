import javax.swing.*;

public class helloWorldPanel extends JFrame {

    JPanel panel;

    public helloWorldPanel() {
        panel = new JPanel();

        this.add(panel);
        this.setTitle("Hello World");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Hello World",  SwingConstants.CENTER);
        JLabel label2 = new JLabel("Hello World", SwingConstants.LEFT);
        JLabel label3 = new JLabel("Hello World", SwingConstants.RIGHT);

        JButton button1 = new JButton("Load");
        JButton button2 = new JButton("Save");
        JButton button3 = new JButton("Delete");

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        panel.setSize(500,500);
        panel.setVisible(true);

        this.add(panel);

        this.pack();
        this.setVisible(true);
    }
}
