import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer");
        int x = scanner.nextInt();
       
        if (x > 0) {
            System.out.println("Positive");            
        }else if (x < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
            scanner.close();
        }
    }

    //Regith Rayabi/20250040075/TI25I/Algorithms