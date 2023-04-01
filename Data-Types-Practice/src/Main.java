import java.util.Scanner;

/**
 * created by James Vincent on 3/26/23
 **/
public class Main {

    public static void main(String[] args) {

        //Calling the Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the integer you like: ");
        //Calling integer variable
        int i = scanner.nextInt();

        System.out.println("Input the double you like: ");
        //Calling double variable
        double d = scanner.nextDouble();

        //Consuming the remaining line of characters
        scanner.nextLine();

        System.out.println("Input the string you like: ");
        //Calling string variable
        String s = scanner.nextLine();

        System.out.println("==== The Result ===");
        System.out.println(i + Integer.parseInt("5"));

        System.out.println(String.format("%.1f", d + Double.parseDouble("5.0")));

        System.out.println("HackerRank " + s);

    }
}
