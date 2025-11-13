package opps.wrapperClass;

import java.math.BigDecimal;

public class DoubleDemo {
    public static void main(String[] args) {
        double d=1d;
        String number="1";
        Double dou=d;
        System.out.println(d);
        System.out.println(dou);
        System.out.println(dou.floatValue());
        System.out.println(dou.byteValue());
        System.out.println(dou.doubleValue());
        System.out.println(dou.intValue());
        System.out.println(dou.isInfinite());
        System.out.println(dou.isNaN());
        System.out.println(Double.valueOf(number));
        System.out.println(Double.parseDouble(number));

        //BigDecimal class used to perform airthmetic operations on double values
        double number1=10.0;
        double number2=12.0;

        BigDecimal bigDecimal=new BigDecimal(number1);
        BigDecimal bigDecimal1= new BigDecimal(number2);
        BigDecimal number3=bigDecimal1.subtract(bigDecimal);
        System.out.println(number3);
    }
}
