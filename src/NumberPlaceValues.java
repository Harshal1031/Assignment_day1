import java.util.Scanner;

public class NumberPlaceValues {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number (1, 10, 100, or 1000)
        System.out.print("Enter a number (1, 10, 100, or 1000): ");
        int number = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the entered number is valid
        if (number != 1 && number != 10 && number != 100 && number != 1000) {
            System.out.println("Invalid input. Please enter 1, 10, 100, or 1000.");
            return;
        }

        // Extract and display the place values
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;
        int thousands = (number / 1000) % 10;

        System.out.println("Thousands: " + thousands);
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Units: " + units);
    }

}
