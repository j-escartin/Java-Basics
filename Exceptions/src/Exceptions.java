import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/13/23
 **/
public class Exceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        try{
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
