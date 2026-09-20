/** Demonstrates inheritance from CircleType for a sphere. */
public class SphereType extends CircleType {
    public SphereType(double radius) {
        super(radius);
    }

    public SphereType() {
        super();
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        SphereType sphere = new SphereType(5.0);
        System.out.println("\nSphere Details:");
        System.out.println("Radius: " + sphere.getRadius());
        System.out.println("Surface Area: " + sphere.area());
        System.out.println("Volume: " + sphere.volume());

        CircleType circle = new CircleType(5.0);
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
    }
}
