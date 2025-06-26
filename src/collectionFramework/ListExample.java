package collectionFramework;



import java.util.*;

public class ListExample {

    public static void main(String a[]){
        //ArrayList  RandomAccess interface,cloneable,serializable
        List<Object> mockList=new ArrayList<>();
        mockList.add('1');
        mockList.add(2);
        mockList.add('3');
        for(Object x:mockList){
            System.out.print(x);
        }


        //LinkedList queue also 1.5v
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("L1");
        linkedList.add("L2");
        linkedList.add("L3");
        for(Object y:linkedList){
            System.out.println(y);
        }


        //Vector legacy class thread safe  enumeration used
        Vector<String> vector=new Vector<>();
        vector.add("v1");
        vector.add("v2");
        vector.add("v3");
        for(Object o:vector){
            System.out.println(o);
        }

        //Enumeration
        Enumeration<String> enumeration=vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        //Stack extends vector class
        Stack<String> stack=new Stack<>();
        stack.add("s1");
        stack.add("s2");
        stack.add("s3");
        for(Object s:stack){
            System.out.println(s);
        }
        //delete element from last.
        stack.pop();
        stack.push("s4");
        System.out.println(stack.peek());
        System.out.println(stack);


        Iterator<String> iterator=linkedList.iterator();
        // iterator.remove();
        while (iterator.hasNext()){
            System.out.println("---This iterator Example---"+iterator.next());
        }

        //listIterator(Bi-directional)  only for list Interface.
        //Read,Remove,Replacement,Add new object
        //Child Interface of Iterator.
        ListIterator<Object> listIterator=mockList.listIterator();
        while (listIterator.hasNext()){
            System.out.println("---This is list iterator Example----"+listIterator.next());
        }
        

    }
}
