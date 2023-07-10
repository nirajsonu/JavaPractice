package leetcode.normal;

public class addDigits {
    public static void main(String a[]){
        int n=139;
        System.out.println(sumOfDigitsOfNumber(n));
    }

    private static int sumOfDigitsOfNumber(int n) {
        if(n==0) return 0;
        if(n%9==0){
            return 9;
        }else {
            return n % 9;
        }
    }
}
