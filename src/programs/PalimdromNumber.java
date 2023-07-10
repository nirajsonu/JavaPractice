package programs;

public class PalimdromNumber {
    public static void main(String a[]){
        int x=121;int r=0,sum=0;
        int temp=x;
        while (x>0){
            r=x%10;
            x=x/10;
            sum=(sum*10)+r;
        }
        if(temp==sum){
            System.out.println("Palimdrom Number");
        }
        else{
            System.out.println("Not a plaimdrom Number");
        }

        digitsOfSum(123);
    }

    private static void digitsOfSum(int x) {
        int sum=0,r=0;
        while (x>0){
            r=x%10;
            x=x/10;
            sum=sum+r;
        }
        System.out.println("Sum of digits of the number is "+sum);
    }
}
