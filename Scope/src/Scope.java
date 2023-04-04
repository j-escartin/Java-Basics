import java.util.Scanner;

/**
 * created by James Vincent C. Escartin on 4/4/23
 **/
public class Scope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }

        Difference difference = new Difference(elements);
        difference.computeDifference();

        System.out.println(difference.maximumDifference);
    }
}
