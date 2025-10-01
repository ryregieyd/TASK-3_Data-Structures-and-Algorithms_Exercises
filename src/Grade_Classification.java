import java.util.Scanner;

public class Grade_Classification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade");
        Double grade = scanner.nextDouble();
 
        if (grade >= 80 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("B"); 
        } else if (grade >= 60 && grade < 70) {
            System.out.println("C");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("D"); 
        } else if (grade >= 0 && grade < 50) {
            System.out.println("F");
        } else {
            System.out.println("Invalid Grade");
        }
        scanner.close();
    }
}