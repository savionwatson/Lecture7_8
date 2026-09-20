/**
 * This class demonstrates the use of arrays in Java.
 */
public class ArrayExample {
    /** A static inner class representing an Array object with a value. */
    static class Array {
        int value;

        Array(int value) {
            this.value = value;
    }
    }

    public static void main(String[] args) {
        int length = 5;

        // Create an array of Array objects and initialize them
        Array[] array = new Array[length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = new Array(i);
            }
        }

        // Create an array of integers and initialize them
        int[] arrayInt = new int[length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i;
        }

        // Create an array of strings and initialize them
        String[] arrayString = new String[length];
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = "String " + i;
        }

        // Print the values of the arrays
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "]: " + array[i].value);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("ArrayInt[" + i + "]: " + arrayInt[i]);
        }

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("ArrayString[" + i + "]: " + arrayString[i]);
    }
    }
}