import java.util.Scanner;

/**
 * created by James Vincent Escartin on 3/29/23
 **/
public class Index {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your number of test cases: ");
        int inputNo = scanner.nextInt();

        for(int j = 0; j < inputNo; j++){

            System.out.println("Input the string you want to test: ");
            String str = scanner.next();

            int length = str.length();

            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();

            for(int i = 0; i < length; i ++){
                char ch = str.charAt(i);
                if( i % 2 == 0) {
                    evenStr.append(ch);
                } else {
                    oddStr.append(ch);
                }
            }

            System.out.println("Result");
            System.out.println(evenStr.toString() + " " + oddStr.toString());
        }

        scanner.close();
    }
}
