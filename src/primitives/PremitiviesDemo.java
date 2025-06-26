package primitives;

public class PremitiviesDemo {

    //static member not allowed in methods only allowed on class level
    static String m1="Neeraj";
    static int x=10;



    static {
        int y=01;
    }

    public void m1(){
        int s=10;
    }
    public static void main(String[] args) {
        //increment and Decrement operators
        int x=0;
        ++x;
        //Pre increment and assignment
        System.out.println(++x);

        //Post increment but assignment on next time;
        x++;
        System.out.println(x++);
        System.out.println(x++);


        int number=10;
        Integer i=number;
        System.out.println(i.getClass());

        PremitiviesDemo p=new PremitiviesDemo();
        p.m1();

       // int intNumber=Integer.MAX_VALUE;
        //System.out.println(intNumber+100);

    }

}

