import java.util.Scanner;

public class Grade_or_Not {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade");
        Double grade = scanner.nextDouble();

        if (grade >= 70 && grade <= 100) {
            System.out.println("Passed");            
        }else if (grade >= 0 && grade < 70) {
            System.out.println("Failed");
        }else{
            System.out.println("Invalid Grade");
        }
            scanner.close();
        }
    }

    //Regith Rayabi/20250040075/TI25I/Algorithms