package Arrays;

import java.util.ArrayList;
import java.util.Collections;

    public class HeightRearranger {
        public static void main(String[] args) {
            int[] heights = {-1, 150, 190, 170, -1, -1, 160, 180};
            int[] rearrangedHeights = rearrangeByHeight(heights);
            // Print the output
            for (int height : rearrangedHeights) {
                System.out.print(height + " ");
            }
        }

        public static int[] rearrangeByHeight(int[] heights) {
            // Create a list to store the heights of the people, excluding the trees
            ArrayList<Integer> peopleHeights = new ArrayList<>();

            // Iterate through the input array and store the people's heights
            for (int height : heights) {
                if (height != -1) {
                    peopleHeights.add(height);
                }
            }

            // Sort the list of people's heights in non-descending order
            Collections.sort(peopleHeights);

            // Iterate through the input array and replace the people's heights
            // while keeping the trees in their original positions
            int index = 0;
            for (int i = 0; i < heights.length; i++) {
                if (heights[i] != -1) {
                    heights[i] = peopleHeights.get(index);
                    index++;
                }
            }

            return heights;
        }
    }
    
