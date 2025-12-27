package collectionFramework;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

// Thread safe methods
// synchronizedList(),synchronizedSet,synchronizedMap lock whole object.
// concurrentHashMap, copyOnWriteArrayList, copyOnWriteArraySet.
// concurrentModification exception.
// putIfAbsent, remove, replace, concurrency level,default level
// fail fast vs. fail-safe--> don't throw concurrentException
// booleanaddIfPresent,addAllAbsent
// flag mod will be used to check modified or not.
// Every update should perform in Separate cloned copy in a concurrent collection.
// EnumMap and EnumSet.
public class ConcurrentCollections {
    public static void main(String[] args) {
        // bucket level locking
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("Neeraj",20000);

        List<String[]> oders = List.of(
                new String[]{"User_1","iPhone"},
                new String[]{"User_2","MacBook"},
                new String[]{"User_1","Airpods"},
                new String[]{"User_2","iPhone"},
                new String[] {"User_1","iPhone"});

        Map<String,List<String>> customerOrders = new HashMap<>();

        // compute
        // for some calculation

        // ifAbsent
        // key is absent add value

        // ifPresent
        // key is present then do some calculation

        

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();

        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
    }
}
