import java.util.Scanner;

public class Demo003 {

    // Method to find the greatest of three numbers
    public static int greatestOfThree(int num1, int num2, int num3) {
        // Compare the numbers to find the greatest
        if (num1 >= num2 && num1 >= num3) {
            return num1;  // num1 is the greatest
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;  // num2 is the greatest
        } else {
            return num3;  // num3 is the greatest
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read the second number

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();  // Read the third number

        // Call the function to find the greatest number
        int result = greatestOfThree(num1, num2, num3);

        // Display the result
        System.out.println("The greatest of the three numbers is: " + result);

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}

    

