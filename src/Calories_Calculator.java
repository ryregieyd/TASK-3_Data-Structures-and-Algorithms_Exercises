import java.util.Scanner;

public class Calories_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter time spent running (in minutes): ");
        double runningMinutes = scanner.nextDouble();
            System.out.print("Enter time spent doing push-ups (in minutes): ");
        double pushupMinutes = scanner.nextDouble();
            System.out.print("Enter time spent doing planks (in minutes): ");
        double plankMinutes = scanner.nextDouble();
        
        double runningCaloriesPerMinute = 60.0 / 5;   
        double pushupCaloriesPerMinute = 200.0 / 30;     
        double plankCaloriesPerMinute = 5.0;            

        double runningCalories = runningMinutes * runningCaloriesPerMinute;
        double pushupCalories = pushupMinutes * pushupCaloriesPerMinute;
        double plankCalories = plankMinutes * plankCaloriesPerMinute;

        double totalCalories = runningCalories + pushupCalories + plankCalories;

            System.out.println("\n--- Calories Burned ---");
            System.out.printf("Running: %.2f calories%n", runningCalories);
            System.out.printf("Push-ups: %.2f calories%n", pushupCalories);
            System.out.printf("Planks: %.2f calories%n", plankCalories);
            System.out.printf("Total Calories Burned: %.2f calories%n", totalCalories);

        scanner.close();
    }
}

    
