import java.util.Scanner;

public class Largest_Number_Finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
            System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
            System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        int largest = a;
        String var = "a";

        if (b > largest) {
            largest = b;
            var = "b";
        }
        if (c > largest) {
            largest = c;
            var = "c";
        }
        System.out.println("The largest number is " + var + " = " + largest);
        scanner.close();
    }
}
