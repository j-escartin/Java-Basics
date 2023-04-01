import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/1/23
 **/
public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input the integers
        int n = scanner.nextInt();

        //calling findMaxConsecutiveOnes Function
        int maxConsecutiveOnes = findMaxConsecutiveOnes(n);

        //Print out to the console
        System.out.println(maxConsecutiveOnes);
    }

    public static int findMaxConsecutiveOnes(int n){
        int maxCount = 0;
        int count = 0;

        // Iterating
        while(n>0) {

            //And Operator to check the least significant bit
            if((n & 1) == 1){
                count ++;
                if(count > maxCount){
                    maxCount = count;
                }
            } else {
                count = 0;
            }

            //Right shifting the Bit
            n >>= 1;
        }
        return maxCount;
    }
}
