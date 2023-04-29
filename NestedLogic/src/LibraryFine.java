import java.time.LocalDate;
import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/29/23
 **/
public class LibraryFine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read actual and expected date
        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();
        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        //Calculate Fine
        int fine = 0;
        LocalDate actualDate = LocalDate.of(actualYear, actualMonth, actualDay);
        LocalDate expectedDate = LocalDate.of(expectedYear, expectedMonth, expectedDay);
        if(actualDate.isAfter(expectedDate)){
            if(actualDate.getYear() > expectedDate.getYear()){
                fine = 10000;
            } else if (actualDate.getMonthValue() > expectedDate.getMonthValue()){
                fine = 500 * (actualDate.getMonthValue() - expectedDate.getMonthValue());
            } else {
                fine = 15 * (int) (actualDate.toEpochDay() - expectedDate.toEpochDay());
            }
        }

        //PrintFine
        System.out.println(fine);

        scanner.close();
    }
}
