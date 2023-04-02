import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/2/23
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();

        int[] scores = new int[numScores];
        for (int i = 0; i<numScores; i++){
            scores[i] = scanner.nextInt();
        }
        Student s = new Student(firstName, lastName, id, scores);
        System.out.println("Name: " + s.lastName + ", " + s.firstName);
        System.out.println("ID: " + s.idNumber);
        System.out.println("Grade: " + s.calculate());
        scanner.close();
    }
}
