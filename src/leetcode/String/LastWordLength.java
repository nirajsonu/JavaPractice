package leetcode.String;

public class LastWordLength {
    public static void main(String a[]){
        String s="Neeraj is a good water ".trim();
        String lastWord="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            lastWord=arr[arr.length-1];
        }
        System.out.println(lastWord.length());
    }
}
