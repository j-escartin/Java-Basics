import java.util.*;

/**
 * created by James Vincent Escartin on 5/2/23
 **/
public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        List<String> names = new ArrayList<>();

        while(t-- > 0){
            String[] token = scanner.nextLine().split(" ");
            String firstName = token[0];
            String email = token[1];

            if (email.endsWith("@gmail.com")){
                names.add(firstName);
            }
        }

        Collections.sort(names);

        for (String name : names){
            System.out.println(name);
        }

        scanner.close();
    }
}
