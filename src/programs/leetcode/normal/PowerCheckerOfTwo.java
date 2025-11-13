package programs.leetcode.normal;

public class PowerCheckerOfTwo {
    public static void main(String a[]){
        int x=512;
        System.out.println(checkPower(x));
    }

    private static Boolean checkPower(int x) {
        if(x<=0){
            return false;
        }
        return (x & (x-1))==0;
    }


}
