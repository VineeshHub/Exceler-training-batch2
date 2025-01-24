import java.util.Scanner;

public class demo017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String loginid = "";
        String pwd = "";
        String reply;

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited our site earlier? (yes/no)");
            reply = scan.nextLine();

            if (reply == "no") {
                System.out.println("Login here");
                System.out.println("Enter your ID:");
                loginid = scan.nextLine();
                System.out.println("Enter your password:");
                pwd = scan.nextLine();
            } else {
                System.out.println("You are our valued customer.");
            }

        } while (!loginid.equals("Srinath") || !pwd.equals("123456")); // Loop until valid credentials

        System.out.println("Login successful!");
        scan.close();
    }
}
