import java.util.Scanner;

public class NumberToWord {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a single-digit number
        System.out.print("Enter a single-digit number (0-9): ");
        int digit = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the entered number is a single digit (0-9)
        if (digit >= 0 && digit <= 9) {
            // Convert the number to word form
            String word;
            switch (digit) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                default:
                    word = "Invalid";
            }

            // Display the number in word form
            System.out.println("Number in word form: " + word);
        } else {
            System.out.println("Invalid input. Please enter a single-digit number.");
        }
    }

}
