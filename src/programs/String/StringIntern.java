package programs.String;

public class StringIntern {
    public static void main(String a[]){
        String s="Neeraj";
        String s1="Neeraj";
        String s3=new String("Neeraj");
        String s4=s3.intern();
        System.out.println(s.equals(s1));
        System.out.println(s==s3);
        System.out.println(s==s4);




    }
}
