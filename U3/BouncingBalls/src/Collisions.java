/*
 * Collisions.java
 * Leo Bogaert
 * June 12, 2024
 * This class contains methods that handle and detect collisions between balls and  walls
 */

import static java.lang.Math.*;

public class Collisions {

    /**
     * Checks if the balls are colliding by comparing distances
     * between them and the radi
     * @param b1 SuperBall object to be checked
     * @param b2 SuperBall object to be checked against
     * @return boolean true if objects are colliding
     */
    public static boolean checkCollision (Ball b1, Ball b2) {
        return distance(b1,b2) <= (b1.radius + b2.radius);
    }

    /**
     * Handles the collision between two balls
     * @param b1 SuperBall object being collided with
     * @param b2 SuperBall object to be collided
     */
    public static void handleCollisions (Ball b1, Ball b2) {

        // Correct the position of the balls if they are overlapping
        if (b2.radius > b1.radius) staticCollision(b1, b2);
        else staticCollision(b2, b1);

        double xDist = (b1.position.x + b1.radius) - (b2.position.x + b2.radius);
        double yDist = (b1.position.y + b1.radius) - (b2.position.y + b2.radius);
        double xVelDiff = b2.velocity.x - b1.velocity.x;
        double yVelDiff = b2.velocity.y - b1.velocity.y;

        double distSquared = xDist*xDist + yDist*yDist; // avoid square root
        double dotProduct = xDist * xVelDiff + yDist * yVelDiff;

        if (dotProduct > 0) { // Check if fruit are going towards eachother
            double colScale = dotProduct / distSquared;
            double xCol = xDist * colScale;
            double yCol = yDist * colScale;
            double combinedMass = 2;
            double colWeightB1 = 2 / combinedMass;
            double colWeightB2 = 2 / combinedMass;

            b1.velocity.x += colWeightB1 * xCol;
            b1.velocity.y += colWeightB1 * yCol;
            b2.velocity.x -= colWeightB2 * xCol;
            b2.velocity.y -= colWeightB2 * yCol;
        }
    }

    /**
     * Finds and corrects the overlap between balls
     * @param b1 SuperBall object that is stationary
     * @param b2 SuperBall object that is to be corrected
     */
    public static void staticCollision(Ball b1, Ball b2) {
        double overlap = b1.radius + b2.radius - distance(b1, b2);

        double theta = Math.atan2(((b1.position.y + b1.radius) - (b2.position.y + b2.radius)), ((b1.position.x + b1.radius) - (b2.position.x + b2.radius)));
        b2.position.x -= (int) round(overlap * Math.cos(theta));
        b2.position.y -= (int) round(overlap * Math.sin(theta));
    }

    /**
     * Calculates the distance between two balls
     * @param b1 SuperBall object
     * @param b2 SuperBall object
     * @return double distance between the balls
     */
    public static double distance (Ball b1, Ball b2){
        return Math.sqrt(pow((b2.position.x+b2.radius) - (b1.position.x + b1.radius), 2) + pow((b2.position.y+b2.radius) - (b1.position.y + b1.radius), 2));
    }
}
