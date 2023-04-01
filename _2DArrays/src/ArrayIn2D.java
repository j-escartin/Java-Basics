import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/1/23
 **/
public class ArrayIn2D {

    public static void main(String[] args) {

        int[][] arr = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                    + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum hourglass sum: " + maxSum);
    }
}
