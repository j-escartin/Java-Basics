import java.util.Scanner;

/**
 * created by James Vincent Escartin on 3/28/23
 **/
public class ClassVsInstance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for(int j = 0; j < testCase; j++ ) {

            System.out.print("Input your age: ");
            int inputAge = scanner.nextInt();

            Person person = new Person(inputAge);

            System.out.println("Am I Old?");
            person.amIOld();

            for (int i = 0; i < 3; i++) {
                person.yearPasses();
            }

            System.out.println("3 Years Passes");
            person.amIOld();

        }

        scanner.close();
    }
}
