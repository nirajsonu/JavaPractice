package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String args[]){
        //HashTable data structure,duplicates not allowed,insertion order not preserved.
        //searching is fast.null allowed,Serializable and Cloneable.
        //only homogenous element allowed,Balanced tree,duplicates are not allowed,insertion order not preserved
        //Sorting order.
        //Sorted set according to some sorting order without duplicates
        //methods
        //first(),last(),headSet(10),tailSet(104),subSet(103,110),comparator().
        Set<Object> treeSet=new  TreeSet<>();
        treeSet.add(1);
       // treeSet.add("neeraj");   homogenous data will come here
        System.out.println(treeSet);

        TreeSet<String> treeSet1=new TreeSet<>();
        treeSet1.add("acd");
        treeSet1.add("aaa");
        treeSet1.add("vas");
        treeSet1.add("cac");
        treeSet1.add("acd");
        System.out.println(treeSet1.floor("abc")+treeSet1.ceiling("aca")+treeSet1.higher("aab"));

        //Child class of hashSet
        //insertion order preserved,hashTable+linkedlist
        //Application in cache application
        Set<Object> HashSet=new HashSet<>();
        HashSet.add("A");
        HashSet.add("C");
        HashSet.add("B");
        System.out.println(HashSet);


        //NavigableSet(1.6v)
        //lower()->before,floor()-->before and current,higher(),ceiling(),
        // pollFirst()-->remove and return first element
        //pollLast()-->remove and return last element
        //descendingSet()
        Set<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);

    }
}
