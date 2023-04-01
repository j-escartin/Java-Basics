import java.util.Scanner;

import static java.lang.Math.round;

/**
 * created by James Vincent Escartin on 3/27/23
 **/
public class OperatorsMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Meal Cost: ");
        int meal_cost = scanner.nextInt();

        System.out.println("Input Tip Percentage: ");
        double tip_percent = scanner.nextInt();

        System.out.println("Input Tax Percentage: ");
        double tax_percent = scanner.nextInt();

        double tip_value = meal_cost * (tip_percent/100.0);

        double tax_value = meal_cost * (tax_percent/100.0);

        double totalCost = meal_cost + tip_value + tax_value;
        System.out.println("Total Cost: " + round(totalCost));

        scanner.close();
    }
}
