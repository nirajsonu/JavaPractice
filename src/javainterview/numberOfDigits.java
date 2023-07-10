package javainterview;

public class numberOfDigits {
    public static void main(String a[]){
        int x=523456;
        System.out.println(getNumberOfDigits(x));
}

    private static int getNumberOfDigits(int x) {
        int countDigits=0;
        while(x>0){
            countDigits++;
            x=x/10;
        }
        return countDigits;
    }


}
