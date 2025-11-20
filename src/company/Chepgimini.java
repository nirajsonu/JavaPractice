package company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chepgimini {
    public static void main(String[] args) {
        int firstArr[] = {1, 2, 3, 4, 5};
        int secondArr[] = {2, 3, 6, 7, 8};

        int outputArray[] = new int[firstArr.length + secondArr.length];

        // Copy first array
        for (int i = 0; i < firstArr.length; i++) {
            outputArray[i] = firstArr[i];
        }

        // Copy second array
        for (int i = 0; i < secondArr.length; i++) {
            outputArray[firstArr.length + i] = secondArr[i];
        }

        // Print result
        for (int number : outputArray) {
            System.out.print(number+ " ");
        }

        List<Integer> merged =
                Stream.concat(
                        Arrays.stream(firstArr).boxed(),
                        Arrays.stream(secondArr).boxed()
                ).collect(Collectors.toList());
        System.out.println(merged);

    }

}
