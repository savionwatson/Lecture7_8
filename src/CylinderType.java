/**
 * This class represents a cylinder, which is a three-dimensional shape.
 * It extends the CircleType class to inherit properties of a circle.
 */
public class CylinderType extends CircleType {
    private double height;

    public CylinderType(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public CylinderType() {
        super();
        this.height = 0.0; // Default height
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return super.area() * 2 + 2 * Math.PI * getRadius() * height;
    }

    public double volume() {
        return super.area() * height;
    }

    public static void main(String[] args) {
        CylinderType cylinder = new CylinderType(5.0, 10.0);
        System.out.println("\nCylinder Details:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Surface Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}
