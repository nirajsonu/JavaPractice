package opps;

public class ImmutableVsFinal {

    public static void main(String a[]){
        final StringBuffer sb=new StringBuffer("durga");
        sb.append("software");
        System.out.println(sb);
        //sb.delete()
        //sb.replace()
    }


}
