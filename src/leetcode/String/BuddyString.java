package leetcode.String;

public class BuddyString {
    public static void main(String a[]){
        String s="ab";
        String s1="ba";
        StringBuffer sb=new StringBuffer(s);
       String reverse= sb.reverse().toString();
        if(s1.equals(reverse)){
            System.out.println("buddy string");
        }
        else{
            System.out.println("non buddy string");
        }
    }
}
