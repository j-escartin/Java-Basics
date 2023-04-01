import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * created by James Vincent Escartin on 3/28/23
 **/

public class Loop {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input the integer: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 1; i<=10; i++ ){

            int product = n * i;

            System.out.println(n + " x " + i + " = " + product);
        }

        bufferedReader.close();
    }
}
