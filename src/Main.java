import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println(arr.getClass().getName());
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println(i+arr[i]);
        }

        String [] myString={"A","AA","AAA"};
        System.out.println(myString[0].length());


        sumMethod(new int[]{10,20,30});


        Object[] a=new Object[10];
        a[0]=new Object();
        a[1]=new String("jello");
        a[2]= 10;

        Number n= 10;


       ClassTypeArray classTypeArray[]=new ClassTypeArray[10];
       classTypeArray[0]= new ClassTypeArray("Neeraj");
       System.out.println(Arrays.toString(classTypeArray));

    }

    private static void sumMethod(int[] ints) {
        for(int x:ints){
            System.out.println(x);
        }
    }

    static class ClassTypeArray{
        String name;
        ClassTypeArray(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return "ClassTypeArray{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}