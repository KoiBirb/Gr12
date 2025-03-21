import javax.swing.*;
import java.awt.*;

public class drawPanel extends JPanel {

    Polygon p;

    public drawPanel() {

        this.setPreferredSize(new Dimension(300, 300));

        p = new Polygon();
        p.addPoint(150, 0);
        p.addPoint(0, 150);
        p.addPoint(150, 300);
        p.addPoint(300, 150);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.BLUE);

        g2.fillRect(0,0,20,20);
        g2.fillRect(280,0,20,20);
        g2.fillRect(0,280,20,20);
        g2.fillRect(280,280,20,20);

        g2.setColor(Color.ORANGE);

        g2.fillPolygon(p);

        g2.setColor(Color.YELLOW);

        g2.fillRect(0,0,150,200);

        g2.setColor(Color.GREEN);

        g2.drawRect(0,0,150,200);

        g2.dispose();
    }
}
