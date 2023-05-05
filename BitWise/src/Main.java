import java.util.Scanner;

/**
 * created by James Vincent Escartin on 5/5/23
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int max = 0;
            for (int a = 1; a <=n; a++){
                for(int b = a +1; b<=n; b++){
                    int bitwiseAnd = a & b;
                    if(bitwiseAnd < k && bitwiseAnd > max){
                        max = bitwiseAnd;
                    }
                }
            }
            System.out.println(max);
        }
        scanner.close();
    }
}
