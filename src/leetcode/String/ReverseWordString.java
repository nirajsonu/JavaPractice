package leetcode.String;

public class ReverseWordString {
    public static void main(String a[]){
        String s="Neeraj kumar keshri";
        String arr[]=s.split(" ");
        String d= arr[0]+" ";
        StringBuffer stringBuffer=new StringBuffer();
       for(int i=arr.length-1;i>0;i--){
           stringBuffer.append(arr[i]+" ");
       }
     //  System.out.println(stringBuffer+d);


        String [] str = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            if(str[i]!=""){
                sb.append(str[i]);
                sb.append(" ");
            }
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb.toString());
    }
}
