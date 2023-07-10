package CollectionClass;

import java.util.*;

public class CollectionsClassExample {

    //Collections is a utility class used to perform actions of any collection object
    //Collections sorting for List interface sort.
    //Collection class defines several utility method for collection objects like sorting,searching,reversing,etc.

    public static void main(String args[]){

        List list=new ArrayList();
        //list.add(null);
        list.add(1);
        list.add(2);
        list.add(null);



        //With collection type
        //list should contain null otherwise we will get null pointer execution.
        //to sort based on default natural sorting order.in this case list should complesary contain
        // homogenous and comparable objects otherwise we will get run time exception class cast exception.
        Collections.sort(list);
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });



        //To make Synchronized version of HashMap
        HashMap map=new HashMap();
        Map m=Collections.synchronizedMap(map);
       List l= Collections.synchronizedList(list);



        //With list and Comparator
       // Collections.sort(list, Comparator c);




    }


}
