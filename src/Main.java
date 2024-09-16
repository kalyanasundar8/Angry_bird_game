import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=====* Angry Birds RIO *=====");
        System.out.println("Enter your name:");
        String name = scan.nextLine();

        if (name.isEmpty()) {
            System.out.println("Please enter a valid name");
        }

        System.out.println("Welcome to Angry Birds RIO " + name);

        while (true) {
            System.out.println("Angry Birds RIO menu:");
            System.out.print("h. Home ");
            System.out.print("#b. Birds List ");
            System.out.println("#e. Exit ");

            System.out.println("Enter your choice:");
            String input = scan.nextLine();

            switch (input) {
                case "h":
                    System.out.println("Home");
                    break;
                case "b":
                    System.out.println("Birds List");
                    break;
                case "e":
                    System.out.println("Exited");
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}