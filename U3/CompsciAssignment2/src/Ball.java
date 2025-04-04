/*
 * Ball.java
 * Leo Bogaert
 * April 4, 2025
 * Handles ball updating of position and collisions and drawing
 */

import java.awt.*;
import java.util.Random;

import static java.lang.Math.pow;

public class Ball {

    // Declare ball variables
    public Vector2 position,velocity;
    public int radius, speed, width, height;

    private final Color color;

    /**
     * Constructor for Ball
     * Create random position, direction, speed, and color
     */
    public Ball() {
        Random rand = new Random();
        this.position = new Vector2(rand.nextDouble(1, 750), rand.nextDouble(1, 550));
        this.velocity = new Vector2(rand.nextDouble(10, 15), rand.nextDouble(10, 15));
        this.color = new Color(rand.nextInt(0, 256), rand.nextInt(0, 256), rand.nextInt(0, 256));
        this.speed = rand.nextInt(1,10);

        this.radius = 25;
        this.height = 600;
        this.width = 800;
    }

    /**
     * Update method for the ball
     * Handles ball movement and collisions
     */
    public void update() {

        wallCollisions();

        for (Ball ball : Main.gamePanel.balls) {
            if (ball != this) {
                if (checkCollision(ball)) {
                    collisions(ball);
                }
            }
        }

        position.add(velocity.setLength(speed));
    }

    /**
     * Draws ball
     * @param g2 Graphics2D object to draw the ball
     */
    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillOval((int) position.x, (int) position.y, radius * 2, radius * 2);
    }

    /**
     * Checks the collision between self and ball
     */
    private boolean checkCollision (Ball b) {
        return distance(b) <= (radius + b.radius);
    }

    /**
     * Handles the collision between self and a ball
     * @param b the ball to collide with
     */
    private void collisions(Ball b) {

        Vector2 distance = new Vector2((position.x + radius) - (b.position.x + b.radius),
                (position.y + radius) - (b.position.y + b.radius));

        Vector2 velocityDifference = new Vector2(b.velocity.x - velocity.x, b.velocity.y - velocity.y);

        double distSquared = Math.pow(distance.x,2) + Math.pow(distance.y,2);
        double dotProduct = distance.dotProduct(velocityDifference);

        // if the balls are moving towards each other
        if (dotProduct > 0) {
            distance.multiplyScalar(dotProduct / distSquared);

            velocity.add(distance);
            b.velocity.subtract(distance);
        }
    }

    /**
     * Handles wall collisions
     */
    private void wallCollisions() {

        // horizontal
        if (position.x < 0) {
            position.x = 0;
            velocity.x *= -1;
        } else if (position.x > width - radius*2) {
            position.x = width - radius*2;
            velocity.x *= -1;
        }

        // vertical
        if (position.y < 0) {
            position.y = 0;
            velocity.y *= -1;
        } else if (position.y > height - radius*2) {
            position.y = height - radius*2;
            velocity.y *= -1;
        }
    }

    /**
     * Gets the distance between self and a ball
     * @param b Other ball to calculate the distance to
     * @return Distance between self and other ball
     */
    private double distance (Ball b){
        return Math.sqrt(pow((b.position.x+b.radius) - (position.x + radius), 2) + pow((b.position.y+b.radius) - (position.y + radius), 2));
    }
}
