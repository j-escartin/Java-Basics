# Problem

This problem is about unit testing.

Your company needs a function that meets the following requirements:

For a given array of n integers, the function returns the index of the element with the minimum value in the array. If there is more than one element with the minimum value, it returns the smallest one.
If an empty array is passed to the function, it raises an exception. A colleague has written this method. 

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

A coworker has prepared functions that will perform the tests and validate return values. Finish the implementation of 3 classes to provide data and expected results for the tests.

Complete the following methods.

In the class TestDataEmptyArray:

get_array() returns an empty array
In the class TestDataUniqueValues:

get_array() returns an array of size at least 2 with all unique elements
get_expected_result() returns the expected minimum value index for this array
In the class TestDataExactlyTwoDifferentMinimums:

get_array() returns an array where the minimum value occurs at exactly 2 indices
get_expected_result() returns the expected index
Take a look at the code template to see the exact implementation of functions that your colleague already implemented.

Note: The arrays are indexed from 0.
