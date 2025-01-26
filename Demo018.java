import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the multiple thet you want numbers: ");
        a = sc.nextInt();
        int result = ((a + 50) / 100) * 100;

        System.out.println("Nearest muntiple number of this number is: " + result);

    }

}
