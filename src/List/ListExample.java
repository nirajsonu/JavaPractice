package List;

import com.sun.xml.internal.ws.addressing.v200408.MemberSubmissionWsaClientTube;

import java.util.*;

public class ListExample {

    public static void main(String a[]){
        //ArrayList
        List mockList=new ArrayList();
        mockList.add('1');
        mockList.add(2);
        mockList.add('3');
        for(Object x:mockList){
            System.out.print(x);
        }


        //LinkedList
        LinkedList linkedList=new LinkedList();
        linkedList.add("L1");
        linkedList.add("L2");
        linkedList.add("L3");
        for(Object y:linkedList){
            System.out.println(y);
        }





        //Vector
        Vector vector=new Vector();
        vector.add("v1");
        vector.add("v2");
        vector.add("v3");
        for(Object o:vector){
            System.out.println(o);
        }

        //Stack
        Stack stack=new Stack();
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

        //Enumeration
        Iterator iterator=linkedList.iterator();
        // iterator.remove();
        iterator.next();
        iterator.hasNext();

        //listIterator(Bi-directional)  only for list Interface.
        //Read,Remove,Replacement,Add new object
        //Child Interface of Iterator.
        ListIterator listIterator=mockList.listIterator();
        listIterator.next();
        

    }
}
