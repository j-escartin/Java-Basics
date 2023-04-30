/**
 * created by James Vincent Escartin on 4/30/23
 **/
public class TestSolution {
    public static void main(String[] args) {
        //Test empty array
        try {
            int[] arr = TestDataEmptyArray.get_array();
            Solution.findMin(arr);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Test Unique Values Array
        assert TestDataUniqueValues.get_expected_result()
                == Solution.findMin(TestDataUniqueValues.get_array());

        //Test Array with exactly two different minimums
        assert TestDataExactlyTwoDifferentMinimums.get_expected_result()
                == Solution.findMin(TestDataExactlyTwoDifferentMinimums.get_array());

        //Print Success Message
        System.out.println("All Test Cases has passed");
    }
}
