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


        // left shift op means multiplying by 2 ka power 1 = 12 * 2 ^ 1  = 12
        int number1 = 12;
        int number2 = 16;
        System.out.println(number1<<1);

        // right shift operator divide by 2 ka power 1 = 12/2 =6
        System.out.println(number1>>1);

        // and the operator means both bits one then one otherwise 0
        System.out.println(number1 & number2);

        // or any one bit 1 then 1 otherwise 0
        System.out.println(number1 | number2);

        //NOT operator flips all bits (0→1, 1→0), and mathematically equals -(x + 1) in Java.
        System.out.println(~number2);

        //means shift right and fill with 0 — no sign protection.
        System.out.println(number2>>>1);

        if (number2 > 0 && (number2 & (number2 - 1)) == 0) {
            System.out.println("Power of two!");
        }
    }
}
