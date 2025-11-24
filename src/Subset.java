import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int position = 0;
        List<Integer> list = new ArrayList<>();
        getSubSet(a);
        getSubSetByResursion(a,position,list);
    }

    private static void getSubSetByResursion(int[] a, int position,List<Integer> list) {
        if(a.length == position){
            return;
        }
        getSubSetByResursion(a,position+1,list);
       // list.add();
       // list.remove();
        getSubSetByResursion(a,position+1,list);
    }

    public static void getSubSet(int arr[]){
        for(int i=0;i<(1<< arr.length);i++){
           System.out.print("{");
           for(int j=0;j<arr.length;j++){
               if((i & (1<<j))!=0){
                   System.out.print(arr[j]);
               }
           }
           System.out.print("}");
        }
    }

    private static void getPairs(int[] a,int position) {
        if (position == a.length) return;
        for(int j=position+1;j<a.length;j++){
            System.out.println(a[position]+","+a[j]);
        }
        getPairs(a,position+1);
    }
}
