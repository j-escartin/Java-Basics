import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/28/23
 **/
public class Primality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            if(isPrime(n)) System.out.println("Prime");
            else System.out.println("Not Prime");
        }

    }

    // Check the primality
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i =2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
