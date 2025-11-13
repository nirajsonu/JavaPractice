package opps.wrapperClass;

import java.math.BigInteger;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer first=10;
        Integer second=1;
        System.out.println(first.compareTo(second));
        System.out.println(Integer.max(first,second));
        System.out.println(Integer.min(first,second));
        System.out.println(Integer.sum(first,second));
        System.out.println(Integer.reverse(first));

        byte b = first.byteValue();
        System.out.println(b);

        BigInteger bigInteger=new BigInteger(String.valueOf(first));


    }
}
