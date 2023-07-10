package mapInterface;

import java.util.*;

public class MapExample {


    public static void main(String args[]){
        //HashMap
        // Not Synchronized,Non thread safe,fast,null key,value allowed,non legacy class.
        HashMap hashMap=new HashMap();
        hashMap.put("name","Neeraj");
        hashMap.put("id","222");
        hashMap.put("Address","Ranchi");
        System.out.println("EntrySet-->"+hashMap.entrySet());
        System.out.println("keySet-->"+hashMap.keySet());
        System.out.println("ValueSet-->"+hashMap.values());
        System.out.println(hashMap);


        //when we put same object then one value is replaced
        HashMap newHashMap=new HashMap();
        Integer i=new Integer(10);
        Integer i2=new Integer(10);   //I1.equals(I2).
        newHashMap.put(i,"Neeraj");
        newHashMap.put(i2,"sonu");
        System.out.println(newHashMap);



        //LinkedHashMap(Linkedlist+hashtable)
        //Insertion order preserved,cache based application
        LinkedHashMap linkedHashMap=new LinkedHashMap();
        linkedHashMap.put("name","neeraj");
        linkedHashMap.put("sonu","1");
        System.out.print(linkedHashMap);


        //IndentityHashMap
        //JVM used == operator to get duplicate values.
        IdentityHashMap identityHashMap=new IdentityHashMap();
        Integer i3=new Integer(10);
        Integer i4=new Integer(10);   //I1.equals(I2).
        identityHashMap.put(i3,"Neeraj");
        identityHashMap.put(i4,"sonu");
        System.out.println(identityHashMap);


        //WeakHashMap is responsible for GC.
        WeakHashMap weakHashMap=new WeakHashMap();
        weakHashMap.put("name","neeraj");
        System.out.println("before garbage collector");
        System.out.println(weakHashMap);
        System.gc();
        System.out.println("After GC");
        System.out.print(weakHashMap);



        //Iterator
        //Single Direction Cursors(only forward direction cursor),Read and Remove Operation.
        Iterator<Map.Entry<String,String>> itr=hashMap.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        //Sorted Map
        //sorting based on the of keys,RED black Tree
        //firstKey(),lastKey(),headMap(),tailMap(),subMap(),comparator()
        SortedMap sortedMap=new TreeMap();
        sortedMap.put("1",1);
        sortedMap.put("2",2);
        System.out.print(sortedMap.lastKey());




        //Navigable Map(Traverse in ascending or descending key order)
       // lowerKey, floorKey, ceilingKey and higherKey

        //Tree Map
        //floorKey(),lowerKey(),CeilingKey(),higherKey(e),pollFirstEntry(),pollLastEntry(),descendingMap()




        //HashTable underlying Data Structure Hashtable,Hashcode of the keys,Heterogeneous are allowed.
        //null not allowed,Synchronized,thread safe,slow,legacy class,non RandomAccess,search operation
        //it is 11 size and 0.75 fill capacity.  23%11=1
        //From top to bottom and right to left it print.


        HashMap h=new HashMap();
        h.put(null,null);
        System.out.println(h);

        //null key not allowed
        Hashtable hashtable=new Hashtable();
       // hashtable.put(null,null);




        //Properties
        //variable which frequently changed then we should put in properties file.(abc.properties)
        //key and value should be string type
        //getProprties,setProperties.
        //Enumeration propertyNames()

        Properties p=new Properties();
        //p.load(InputStream);
        //p.store(OutputStream os,String comment);



    }



}
