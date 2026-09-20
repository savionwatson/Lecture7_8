import java.util.Scanner;

/**
 * This program serves as a menu-driven application to demonstrate various Java concepts. It allows the
 * user to select topics such as arrays, ArrayLists, default object methods, wrapper classes, nested
 * classes, and inheritance.
 */
public class Lecture7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("             LECTURE 7-8 MENU            ");
            System.out.println("========================================");
            System.out.println("What program would you like to run?:");
            System.out.println("1. Arrays");
            System.out.println("2. ArrayLists");
            System.out.println("3. Default Object Methods");
            System.out.println("4. Wrapper Classes");
            System.out.println("5. Nested Classes");
            System.out.println("6. Inheritance");
            System.out.println("7. Exit");

            System.out.print("Enter your choice (1-7): ");
            if (input.hasNextInt()) {
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\n------------- ARRAYS -------------");
                        ArrayExample.main(args);
                        System.out.println("----------- END ARRAYS -----------");
                        break;
                    case 2:
                        System.out.println("\n----------- ARRAYLISTS -----------");
                        ArrayListExample.main(args);
                        System.out.println("----------- END ARRAYLISTS -----------");
                        break;
                    case 3:
                        System.out.println("\n------ DEFAULT OBJECT METHODS ------");
                        Person.main(args);
                        System.out.println("----------- END DEFAULT OBJECT METHODS -----------");
                        break;
                    case 4:
                        System.out.println("\n--------- WRAPPER CLASSES ---------");
                        WrapperExample.main(args);
                        System.out.println("----------- END WRAPPER CLASSES -----------");
                        break;
                    case 5:
                        System.out.println("\n--------- NESTED CLASSES ---------");
                        OuterClass.main(args);
                        System.out.println("----------- END NESTED CLASSES -----------");
                        break;
                    case 6:
                        System.out.println("\n--------- INHERITANCE ---------");
                        System.out.println("Select to view either cylinder or sphere/circle:");
                        System.out.println("1. Cylinder");
                        System.out.println("2. Sphere/Circle");
                        System.out.print("Enter your choice (1-2): ");

                        if (input.hasNextInt()) {
                            int subChoice = input.nextInt();
                            switch (subChoice) {
                                case 1:
                                    CylinderType.main(args);
                                    break;
                                case 2:
                                    SphereType.main(args);
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please enter 1 or 2.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter 1 or 2.");
                            input.next(); // Clear the invalid input
                        }

                        System.out.println("----------- END INHERITANCE -----------");
                        break;
                    case 7:
                        System.out.println("Exiting program. Bye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                input.next();
                choice = 0;
            }
        } while (choice != 7);

        input.close();
    }
}
