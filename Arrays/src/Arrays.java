import java.util.Scanner;

/**
 * created by James Vincent Escartin on 3/30/23
 **/
public class Arrays {

    public static void main(String[] args) {

        //Call the Scanner
        Scanner scanner = new Scanner(System.in);

        //Create a scanner integer object
        System.out.print("Specify how many elements are in the array: ");
        int n = scanner.nextInt();

        //Create an integer array with size n
        int[] arr = new int[n];

        //Store the integer array input by the user
        for(int i = 0; i < n; i++){
            System.out.print("Index " + i + " element of your array: ");
            arr[i] = scanner.nextInt();
        }

        //Loop to read the output
        System.out.println("Output");
        for(int i = n-1; i>=0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
