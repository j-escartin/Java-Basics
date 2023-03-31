import java.util.Scanner;

/**
 * created by James Vincent Escartin on 3/31/23
 **/
public class Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input the integer you want to know the factorial
        int n = scanner.nextInt();

        //Result
        int result = factorial(n);

        System.out.println(result);
    }

    public static int factorial(int n){
        if(n == 0 || n ==1){
            return n = 1;
        } else {
            //Recursion
            return n * factorial(n-1);
        }
    }
}
