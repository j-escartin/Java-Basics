import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/21/23
 **/
public class Calculator implements AdvancedArithmetic{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int finalSum = new Calculator().divisorSum(n);

        System.out.println(finalSum);

    }

    @Override
    public int divisorSum(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }

        return sum;
    }
}
