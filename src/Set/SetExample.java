package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String args[]){
        //HashTable data structure,duplicates not allowed,insertion order not preserved.
        //searching is fast.null allowed,Serializable and Cloneable.
        Set set=new HashSet();
        set.add(null);
        set.add(null);
        set.add("Z");
        set.add("Y");
        System.out.println(set);


        //only homogenous element allowed,Balanced tree,duplicates are not allowed,insertion order not preserved
        //Sorting order.
        //Sorted set according to some sorting order without duplicates
        //methods
        //first(),last(),headSet(10),tailSet(104),subSet(103,110),comparator().

        Set treeSet=new  TreeSet();
        treeSet.add(1);
      //  treeSet.add("neeraj");
        System.out.println(treeSet);


        //Child class of hashSet
        //insertion order preserved,hashTable+linkedlist
        //Application in cache application
        Set LinkedHashSet=new HashSet();
        LinkedHashSet.add("A");
        LinkedHashSet.add("B");
        LinkedHashSet.add("C");
        System.out.println(LinkedHashSet);


        //NavigableSet(1.6v)
        //lower()->before,floor()-->before and current,higher(),ceiling(),
        // pollFirst()-->remove and return first element
        //pollLast()-->remove and return last element
        //descendingSet()
    }
}
