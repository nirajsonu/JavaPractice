package datastuctures;



//Arrays is linear data structures
//size is fixed
//one type of data homogeneous type of data  1d and 2d array
public class ArraysExample {
    public static void main(String[] a){
        int [] x={10,11,23,56};

        //find smallest element by o(n) complexity
        int smallest=x[1];
        for(int i=0; i < x.length;i++){
            if(smallest>x[i]){
                smallest=x[i];
            }
        }
        System.out.println(smallest);
    }
}
