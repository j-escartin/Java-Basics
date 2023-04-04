/**
 * created by James Vincent Escartin on 4/4/23
 **/
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // find the maximum and minimum values in the array
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
            if (elements[i] < min) {
                min = elements[i];
            }
        }

        // calculate the maximum absolute difference
        maximumDifference = Math.abs(max - min);
    }
}
