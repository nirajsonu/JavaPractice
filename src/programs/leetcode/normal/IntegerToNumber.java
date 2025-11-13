package programs.leetcode.normal;

public class IntegerToNumber {
    public static void main(String a[]){
        int pre=0,number=0,ans=0;
        String s="XI";
        System.out.println(converStringtoRoman(s,pre,number,ans));

    }

    private static int converStringtoRoman(String s,int pre,int number,int ans) {
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I' :number=1 ;break;
                case 'V' :number=5;break;
                case 'X': number=10;break;
                case 'L':number=50;break;
                case 'C':number=100;break;
                case 'M': number = 1000; break;
            }
            if (4 * number < ans) ans -= number;
            else ans += number;
        }
        return ans;
    }
}
