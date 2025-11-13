package opps.wrapperClass;

public class BooleanDemo {
    public static void main(String[] args) {
        String isLetter="false";
        boolean b=true;
        Boolean b1=b;
        System.out.println(b1.compareTo(b));
        System.out.println(b1.booleanValue());
        System.out.println(Boolean.getBoolean(isLetter));
        System.out.println(Boolean.parseBoolean(isLetter));
        System.out.println(Boolean.valueOf(isLetter));
    }
}
