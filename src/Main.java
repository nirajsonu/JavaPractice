import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "swiss";  // Input string

        // Step 1: Count the occurrences of each character
        Map<Character, Long> frequencyMap = text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Step 2: Find the first non-repeating character
        Character firstNonRepeating = text.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> frequencyMap.get(c) == 1)  // Filter for characters that appear only once
                .findFirst()  // Find the first match
                .orElse(null);  // Default to null if no non-repeating character exists

        // Step 3: Find the last non-repeating character
        Character lastNonRepeating = new StringBuilder(text).reverse().chars()  // Reverse the string and stream its characters
                .mapToObj(c -> (char) c)
                .filter(c -> frequencyMap.get(c) == 1)  // Filter for non-repeating characters
                .findFirst()  // Find the first match (which is last in original string)
                .orElse(null);  // Default to null if no non-repeating character exists

        // Step 4: Output the results
        System.out.println("First non-repeating character: " + (firstNonRepeating != null ? firstNonRepeating : "None"));
        System.out.println("Last non-repeating character: " + (lastNonRepeating != null ? lastNonRepeating : "None"));
    }
}
