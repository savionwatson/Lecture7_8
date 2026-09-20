import java.util.ArrayList;

/**
 * This program demonstrates the use of ArrayLists in Java.
 * It creates an ArrayList of countries, adds some countries to it,
 * and then prints them out. It also tests the ArrayList's ability
 * to grow beyond its initial capacity.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(5);
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Thailand");
        countries.add("Japan");

        for (String country : countries) {
            System.out.println(country);
    }

        // Testing ArrayList's ability to add more than the initial capacity.
        countries.add("Germany");
        System.out.println("-------------");
        System.out.println("After adding Germany:\n");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
