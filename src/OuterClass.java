/**
 * This program demonstrates the use of nested classes in Java.
 */
public class OuterClass {
    private String outerField = "Outer Field";

    /**
     * A non-static inner class that can access the outer class's fields.
     */
    class InnerClass {
        private String innerField = "Inner Field";

        public void display() {
            System.out.println(outerField);
            System.out.println(innerField);
    }
    }

    /**
     * A static inner class that cannot access the outer class's fields directly.
     */
    static class StaticInnerClass {
        private String staticInnerField = "Static Inner Field";

        public void display() {
            System.out.println(staticInnerField);
    }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.display();
    }
}
