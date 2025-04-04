/*
 * Vector2.java
 * Leo Bogaert
 * April 4, 2025
 * 2D vectors that allow for simple vector math
 */

public class Vector2 {

    public double x,y;

    /**
     * Constructor for Vector2
     * @param x x component of the vector
     * @param y y component of the vector
     */
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Addition operation
     * @param v vector to add to self
     */
    public void add(Vector2 v) {
        this.x += v.x;
        this.y += v.y;
    }

    /**
     * subtraction operation
     * @param v vector to add to self
     */
    public void subtract(Vector2 v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    /**
     * multiplication operation
     * @param scalar scalar number multiply the vector by
     */
    public void multiplyScalar(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    /**
     * Normalization of self (sets length to 1)
     */
    public void normalize() {
        double length = Math.sqrt(x * x + y * y);
        if (length != 0) {
            this.x /= length;
            this.y /= length;
        }
    }

    /**
     * returns dot product of self and other vector
     * @param v vector to dot product with
     */
    public double dotProduct(Vector2 v) {
        return this.x*v.x + this.y*v.y;
    }

    /**
     * Sets the length of the vector to a given length
     * @param length length to set the vector to
     * @return new vector with the same direction as self but with the given length
     */
    public Vector2 setLength (double length) {
        Vector2 returnSet = this;

        returnSet.normalize();
        returnSet.multiplyScalar(length);

        return returnSet;
    }
}
