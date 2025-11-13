import java.util.concurrent.Callable;

public class Practicc {
    public static void main(String[] args) throws Exception {

        String number ="3 4";
        String nu[] = number.split(" ");
        String firstNumber = nu[0];
        String secondNumber = nu[1];
        Double sum = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
        System.out.println(sum);


       i i = (a,b)->a+b;
       System.out.println(i.add(10,20));

       Runnable r = ()->{
          System.out.println("hello");
       };

       r.run();

        Callable c =()->{
           System.out.println("call");
           return "done";
        };

        c.call();


        // last word length in string
        String name = "Neeraj Kumar Keshri";
        String words[] = name.split( " ");
       // System.out.println(words[words.length-1].length());

        System.out.println(lengthOfLastWord(name));
    }

    public static int lengthOfLastWord(String s) {
        int len=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }
            else{
                break;
            }
        }
        return len;
    }
}




@FunctionalInterface
interface i{
    int add(int a,int b);
}