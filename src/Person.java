/**
 * This program demonstrates the use of a simple Person class with a name and age.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        System.out.println(person1);
        System.out.println(person2);
    }
}