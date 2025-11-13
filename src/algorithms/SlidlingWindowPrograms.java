package algorithms;


// fixed sliding window
// variable sliding window
// maximum sum of array,min

public class SlidlingWindowPrograms {
    public static void main(String[] args) {
        int number[]  = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(slidingWindow(number,k));
    }

    private static int slidingWindow(int[] number, int k) {
        int maxSum = 0, windowSum = 0;

        // First window: sum of first 'k' elements (e.g., 2 + 1 + 5 = 8)
        for (int i = 0; i < k; i++) {
            windowSum += number[i];
        }

        maxSum = windowSum;

        // Slide the window from index 'k' to end of array
        // At each step: add new element, remove element that falls out of the window
        for (int i = k; i < number.length; i++) {
            windowSum += number[i] - number[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }



}
