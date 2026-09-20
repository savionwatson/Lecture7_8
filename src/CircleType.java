/**
 * This class represents the mathematical concept of a circle for the inheritance program.
 * It has a radius and can calculate its area.
 */
public class CircleType {
    protected double radius;

    public CircleType(double radius) {
        this.radius = radius;
    }

    public CircleType() {
        this.radius = 0.0; // Default radius
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
