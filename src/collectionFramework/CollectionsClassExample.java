package collectionFramework;

import java.util.*;

public class CollectionsClassExample {

    //Collections is a utility class used to perform actions of any collection object
    //Collections sorting for List interface sort.
    //Collection class defines several utility methods for collection objects like sorting, searching, reversing,etc.
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
       // list.add(null);
        list.add(10);
        list.add(55);
        list.add(8);
        list.add(34);
        //With a collection type
        //list should contain null, otherwise we will get null pointer execution.
        //to sort based on default natural sorting order.in this case list should complementary contain
        // homogenous and comparable objects, otherwise we will get run time exception class cast exception.
       // Collections.sort(list);

        System.out.println("After Sorting--"+list);

        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        Collections.shuffle(list);
        System.out.println("After Shuffling "+list);

        //if not present item print -1
        int notPresentElement=Collections.binarySearch(list,1);
        int result=Collections.binarySearch(list,55);
       System.out.println("Not found the key "+notPresentElement);
       System.out.println("found the key " +result);


       System.out.println("After Reversing the list");
       Collections.reverse(list);
       System.out.println(list);

       System.out.println("Max value of the list "+Collections.max(list));
       System.out.println("Min Value of the list "+Collections.min(list));

       System.out.println("Frequency of the elements "+Collections.frequency(list,10));

       Collections.rotate(list,1);
       System.out.println("After Rotating list "+list);



        //To make Synchronized version of HashMap
        HashMap<String,String> map=new HashMap<>();
        Map<String, String> m = Collections.synchronizedMap(map);
       List<Object> l = Collections.singletonList(Collections.synchronizedList(list));



        //With list and Comparator
       // Collections.sort(list, Comparator c);


        //Frequency
        List<String> nameList=new ArrayList<>();
        nameList.add("Neeraj");
        nameList.add("Sonu");
        nameList.add("Keshri");
        nameList.add("Neeraj");
        nameList.add("Neeraj");
        int f = Collections.frequency(list,"Sonu");



        String words[]={"aa","water","air","duck"};
        Integer longest[]= new Integer[words.length];
        Arrays.sort(longest);
        Arrays.sort(longest,Collections.reverseOrder());
        System.out.println(Arrays.toString(longest));
        System.out.println(longest[0]);
    }


}
