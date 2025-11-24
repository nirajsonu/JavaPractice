package algorithms;

// power of 2 1<<n = 2 ka power n
// & 1 to check the least significant bit (LSB).
// ^ used to swap values
// n & (n-1) used to check power 2
// counts bits

//AND (&) → check/set specific bits.
//OR (|) → combine flags.
//XOR (^) → toggle bits, find unique values.
//NOT (~) → invert bits.
//Left Shift (<<) → multiply by powers of 2.
//Right Shift (>>) → divide by powers of 2 (signed).
//Unsigned Right Shift (>>>) → shift right ignoring sign.
public class BItManupulationExample {
    public static void main(String a[]){
        int[] arr = {2, 3, 2, 4, 4};
        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR cancels out duplicates
        }
        System.out.println("Unique element = " + result);

    }
}
