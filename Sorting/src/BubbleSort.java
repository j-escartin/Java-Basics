import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/22/23
 **/
public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the number of elements in the array
        int n = scanner.nextInt();

        //Create an array of n elements
        int[] a = new int[n];

        //Read the elements of the array from the user
        for(int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        //Bubble Sort the Array
        int numSwaps = 0;

        for(int i= 0; i<n ; i++){
            for(int j=0; j< n-1; j++){
                //Swap adjacent elements if they are in decreasing order
                if(a[j] > a[j + 1]){
                    swap(a, j, j+1);
                    numSwaps++;
                }
            }

            if(numSwaps == 0) {
                break;
            }
        }

        //Print Number of Swaps
        System.out.println("Array is sorted in " + numSwaps + " swaps.");

        // Print the first element of the sorted array
        System.out.println("First Element: " + a[0]);

        // Print the last element of the sorted array
        System.out.println("Last Element: " + a[n-1]);
    }

    //Swap two elements in an array
    private static void swap(int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
}
