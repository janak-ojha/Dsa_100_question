import java.util.Scanner;

public class Taking_usr_input {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking String input
        System.out.println("Enter a string: ");
        String userInputString = scanner.nextLine();

        // Taking integer input
        System.out.println("Enter an integer: ");
        int userInputInt = scanner.nextInt();

        // Taking double input
        System.out.println("Enter a double: ");
        double userInputDouble = scanner.nextDouble();

        // Taking character input (we use charAt(0) to get the first character)
        System.out.println("Enter a character: ");
        char userInputChar = scanner.next().charAt(0);

        // Output the inputs
        System.out.println("You entered string: " + userInputString);
        System.out.println("You entered integer: " + userInputInt);
        System.out.println("You entered double: " + userInputDouble);
        System.out.println("You entered character: " + userInputChar);

        // Close the scanner
        scanner.close();
}
}
