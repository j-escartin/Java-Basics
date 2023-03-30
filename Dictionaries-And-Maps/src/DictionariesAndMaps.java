import java.util.*;

/**
 * created by James Vincent Escartin on 3/30/23
 **/
public class DictionariesAndMaps {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input how many do you want to add to the phone book
        int n = scanner.nextInt();

        // Call New HashMap Object to store the name and phone number
        Map<String, String> phoneBook = new HashMap<>();

        //Filling the phone book with n names and numbers
        for(int i=0; i<n; i++){
            String name = scanner.next();
            String phoneNumber = scanner.next();
            phoneBook.put(name, phoneNumber);
        }

        // Query the book for an unknown number of names
        while(scanner.hasNext()){
            String name = scanner.next();
            String phoneNumber = phoneBook.get(name);
            if (phoneNumber != null) {
                System.out.println(name + "=" + phoneNumber);
            } else {
                System.out.println("Not Found!");
            }
        }

    }
}
