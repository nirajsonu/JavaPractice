package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

// Array --> It is fixed in size and homogeneous
// ArrayList --> It is growable and heterogeneous
// order is preserved which order we insert same order it will give
// non synchronized add null and repeated value
// add or remove complexity o(n) and size 1 search 1
public class ArrayListDemo {

    public void getData(){
        //ArrayList.sort();
    }
    public static void main(String[] args) {
        List<Integer> age = new ArrayList<>();
        age.add(24);
        age.add(30);

        for(Integer i:age){
            System.out.println(i);
        }
        // Start from 0th position
        System.out.println(age.get(0));
        System.out.println(Optional.ofNullable(null));

        System.out.println(age.remove(1));
        System.out.println(age);
        System.out.println(age.isEmpty());
        if(age.contains(13)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        // To make Synchronized
        Collections.synchronizedList(age);

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(10);


    }
}
