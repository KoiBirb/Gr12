import java.awt.*;
import java.util.Random;

public class Ball {

    private final Vector2 gravity = new Vector2(0, 2);

    public Vector2 position, velocity;
    public int radius, speed;

    private Random rand = new Random();
    private final Color color = new Color(rand.nextInt(0, 256), rand.nextInt(0, 256), rand.nextInt(0, 256));

    public Ball() {
        this.position = new Vector2(rand.nextDouble(1, 800), rand.nextDouble(1, 800));
        this.velocity = new Vector2(rand.nextDouble(10, 15), rand.nextDouble(10, 15));
        this.radius = 25;
        this.speed = 10;
    }

    public void update() {

        for (Ball ball : Main.gamePanel.balls) {
            if (ball != this) {
                if (Collisions.checkCollision(this, ball)) {
                    Collisions.handleCollisions(this, ball);
                }
            }
        }

        if (position.x < 0) {
            position.x = 0;
            velocity.x *= -1;
        } else if (position.x > Main.gamePanel.getWidth() - radius*2) {
            position.x = Main.gamePanel.getWidth() - radius*2;
            velocity.x *= -1;
        }
        if (position.y < 0) {
            position.y = 0;
            velocity.y *= -1;
        } else if (position.y > Main.gamePanel.getHeight() - radius*2) {
            position.y = Main.gamePanel.getHeight() - radius*2;
            velocity.y *= -1;
        }

        velocity.add(gravity);
        velocity.multiplyScalar(0.99);

        position.add(velocity);
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);

        g2.setStroke(new BasicStroke(5));
        g2.fillOval((int) position.x, (int) position.y, radius * 2, radius * 2);
    }
}
