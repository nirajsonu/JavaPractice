package String;

public class StringExample {
    public static void main(String a[]){

        //(Thread safe),slow because one thread can access at a time.
        //Syncnoized(1.0V)
        StringBuffer sb =new StringBuffer("Durga");
        sb.append("w");
        System.out.println(sb);
        System.out.println(sb.capacity());//Default capacity of sb is 16 characters  (cc+1) *2

        char[] charaters={'a','b','c','d','e'};
        String CharArray=new String(charaters);
        System.out.println(CharArray);

        byte[] bytes={99,98,100,101};
        String ByteArray=new String(bytes);
        System.out.println(ByteArray);


        //CharAt get character by character Data
        String exmple="Hello friends chai pi lo";
        char c=exmple.charAt(1);
        System.out.println(c);

        //Concat method
        String s= "hello";
      //  String s1=s.concat("world");
        String s1=s+"Software";
        System.out.println("\n"+s1);

        //equals method
        String firstString="Durga";
        System.out.println(firstString.equals("durga"));

        //equalIgnoreCase
        System.out.println(firstString.equalsIgnoreCase("durga"));

        //StartWith
        System.out.println(firstString.startsWith("d"));

        //EndWith
        System.out.println(firstString.endsWith("ga"));

        //length
        System.out.println(firstString.length());

        //replace
        System.out.println(firstString.replace('a','b'));

        //subString
        System.out.println(firstString.substring(1));

        //indexOf() method if not present then return -1
        System.out.println(firstString.indexOf("D"));

        //lastIndexOf
        System.out.println(firstString.lastIndexOf("D"));

        //trim
        System.out.println(firstString.trim().length());

        //isEmpty
        System.out.println(firstString.isEmpty());

        //setCharAt()
        //System.out.println(sb.setCharAt(0,'y'));

        System.out.println(sb.delete(1,2));

        //To enhance capacity to stringBuffer
        sb.ensureCapacity(1000);
        System.out.println(sb.capacity());

        //trimToSize() to save capacity and trim to original
        sb.trimToSize();
        System.out.println(sb.capacity());

        //StringBuilder() not thread safe(1.5V)
        //append(),reverse(),insert(),delete()
        StringBuilder sB=new StringBuilder();
        //Method chaining
        sB.append("durga").append("solutions").reverse().insert(2,"xyz").delete(3,7);
        System.out.println(sB);
    }
}
