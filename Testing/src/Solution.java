/**
 * created by James Vincent Escartin on 4/30/23
 **/
public class Solution {
    public static int findMin(int[] arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("Cannot get Minimum value on the Empty Array");
        }

        int minIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }

        return minIndex;
    }
}

class TestDataEmptyArray {
    public static int[] get_array(){
        return new int[]{};
    }
}

class TestDataUniqueValues {
    public static int[] get_array(){
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int get_expected_result(){
        return 0;
    }
}

class TestDataExactlyTwoDifferentMinimums{
    public static int[] get_array(){
        return new int[]{1, 2, 3, 0, 4, 0};
    }

    public static int get_expected_result(){
        return 3;
    }
}
