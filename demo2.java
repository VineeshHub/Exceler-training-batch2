import java.util.Scanner;

public class demo2{
    // Method to find the greatest of two numbers
    public static int greatestOfTwo(int num1, int num2) {
        if (num1 > num2) {
            return num1;  // If num1 is greater, return num1
        } else {
            return num2;  // Otherwise, return num2
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read the second number

        // Call the function to find the greatest number
        int result = greatestOfTwo(num1, num2);

        // Display the result
        System.out.println("The greatest of the two numbers is: " + result);

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
