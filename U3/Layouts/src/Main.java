import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Random;

public class Main {

    static Frame frame;

    public static void main(String[] args) {
        frame = new Frame();

        gridLayout grid = new gridLayout();

        frame.add(grid);
        frame.pack();
        frame.setVisible(true);
    }

    public static class gridLayout extends JPanel implements ComponentListener {

        public gridLayout() {
            this.setPreferredSize(new Dimension(300, 300));

            this.setLayout(new GridLayout(3, 3));

            this.add(new Box());
            this.add(new Box());
            this.add(new Box());

            this.add(new Box());
            this.add(new Box());
            this.add(new Box());

            this.add(new Box());
            this.add(new Box());
            this.add(new Box());

            this.addComponentListener(this);
        }

        @Override
        public void componentResized(ComponentEvent e) {
            int w = this.getWidth();
            int h = this.getHeight();

            if (w < h) h = w;
            else w = h;

            this.setPreferredSize(new Dimension(w, h));

            frame.pack();
        }

        @Override
        public void componentMoved(ComponentEvent e) {

        }

        @Override
        public void componentShown(ComponentEvent e) {

        }

        @Override
        public void componentHidden(ComponentEvent e) {

        }
    }

    public static class Box extends JPanel {

        Random rand = new Random();

        public Box() {
            this.setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        }
    }
}