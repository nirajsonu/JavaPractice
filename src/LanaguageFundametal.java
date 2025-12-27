import lld.designpattern.creational.prototype.Student;

public class LanaguageFundametal {

    public int add(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

    static int r =10; // only class level
    public static void main(String[] args) {
        // valid identifier name is a-z,A-Z,0-9,_,$
        int _abc= 10;
        //int 1234abc = 20; it should start with alphabet or _, case-sensitive,identifier not used but class name we can used
        int abc12 = 30;
        int $abc = 40;
        //int String = 0;
        int Integer =90;
        final int Max = java.lang.Integer.MAX_VALUE;
        byte b = (byte) 200;

        String myArr[] ={"Neeraj","Sonu"};
        args = myArr;
        for(String s:args){
            System.out.println(s);
        }

        /*int x =0;
        if(0){
            System.out.println("true");
        }*/

        double d = 10e3;
        char ch='\ubeef';
        char c ='c';
        char [] vowel ={'a','e','i','o','u'};
        String [] arr = {"Neeraj","Sonu","Suraj","Praveen"};

        System.out.println(_abc);
        System.out.println(abc12);
       // System.out.println(String);
        System.out.println($abc);
        System.out.println(b);
        System.out.println(d);

        // primitive
        int x= 10;

        //reference variable
        Student s = new Student("Neeraj",12,12);
        LanaguageFundametal lanaguageFundametal = new LanaguageFundametal();
        System.out.println(lanaguageFundametal.add(10,23));
        // varargs must always be the last parameter
        x = x++ + ++x;
        System.out.println(x);

        float f =10;
        double de =10;
        System.out.println(f/0);
        System.out.println(de/0);
    }
}
