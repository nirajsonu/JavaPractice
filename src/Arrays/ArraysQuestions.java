package Arrays;

public class ArraysQuestions {
    public static void main(String[] args) {

        // find the 2nd largest element in an array
        int numbers[] = {90,15,9,80,7};
        int highest  = numbers[0];
        int smallest = numbers[0];
        int secondSmallest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
                if(secondSmallest<smallest){
                    secondSmallest = smallest;
                }
            }
        }

        System.out.println("Highest number "+highest);
        System.out.println("Smallest number "+smallest);
        System.out.println("Second Smallest number "+secondSmallest);
    }
}
