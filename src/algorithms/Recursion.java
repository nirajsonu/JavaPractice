package algorithms;

public class Recursion {
    public static void main(String[] a){
        int count=0;
        while (count< 3){                    // break condition
            printMessage("Neeraj");       // recursive function
            ++count;
        }

        int arra[] = {5,4,3};
        int position = 0;
        int sum = 0;
        int j =0;
        printLoop(arra,position,sum);
        printPairs(arra,position,j);
    }

    private static void printPairs(int[] arra, int i,int j) {
        if(i==arra.length) return;
        if(j == arra.length){
            printPairs(arra, i+1, i+2);
            return;
        }
        System.out.println("(" + arra[i] + "," + arra[j] + ")");
        printPairs(arra,i,j+1);
    }

    private static void printLoop(int[] arra, int position,int sum) {
        if(position == arra.length){
            System.out.println(sum);
            return;
        }
        System.out.println(arra[position]);
        sum = sum + arra[position];
        printLoop(arra,position+1,sum);
    }

    public static void printMessage(String s){
      System.out.println(s);
    }
}
