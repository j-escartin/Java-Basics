import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/15/23
 **/
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n,p);
                System.out.println(ans);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
