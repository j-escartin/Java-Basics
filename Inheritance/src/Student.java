/**
 * created by James Vincent Escartin on 4/2/23
 **/
public class Student extends Person{
    private int[] scores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }

    public char calculate(){
        int sum = 0;
        for(int i =0; i<scores.length; i++){
            sum += scores[i];
        }
        int avg = sum/scores.length;

        if(avg >=90 && avg <=100){
            return 'O';
        } else if (avg >= 80 && avg<90) {
            return 'E';
        } else if (avg >= 70 && avg<80) {
            return 'A';
        } else if (avg >= 55 && avg<70) {
            return 'P';
        } else if (avg >= 40 && avg<55) {
            return 'D';
        } else{
            return 'T';
        }
    }
}
