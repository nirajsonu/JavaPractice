package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//if you want to process the objects then we should go for Stream API.
public class StreamApiExample {

    public static void main(String a[]){

      //  Stream<Integer> streamInteger = Stream.iterate(1,i->i<=20,i->i*2);
        //streamInteger.forEach(System.out::println);

        Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);

       /* stringBuilderMethods();
        stringOperation();
        intergerOpertaion();
        arrayOperations();
        colletionOperations();
        concatTwoStreams();
        //for sort string..
        String[] namess={"Neeraj","Soun","Prince","Amit","Bablue"};
        Stream.of(namess).sorted(String::compareToIgnoreCase).forEach(System.out::println);*/
    }

    private static void concatTwoStreams() {
        Stream<Integer> st=Stream.of(1,2,3);
        Stream<Integer> st1=Stream.of(2,3,4);
        Stream<Integer> concat = Stream.concat(st, st1);
        System.out.println(concat.collect(Collectors.toList()));
        System.out.println(st.isParallel());
        System.out.println(st.sequential());
    }

    private static void colletionOperations() {
    }

    private static void arrayOperations() {
    }

    private static void intergerOpertaion() {
        //map
        Stream<Integer> stream=Stream.of(1,2,34,55);
        stream.map(i -> i * i).collect(Collectors.toList()).forEach(System.out::print);
     // Integer i=  stream.min(Integer::compareTo).get();
     // System.out.println(i);
      stream.close();
    }

    private static void stringOperation() {
        //Array ko list me
        List<String> names= Arrays.asList("Neeraj","Keshri","Kumar");
        //Filter to pass lambda elements.Filter(Predicate) allows rerun Boolean
        List<String> count=names.stream().filter(x->x.startsWith("N")).collect(Collectors.toList());
        System.out.println(count);
      //  System.out.println(count);
        //count()
        System.out.println(names.stream().count());
    }

    private static void stringBuilderMethods() {
        //empty Stream
        Stream s=Stream.empty();

        //Stream of
        Stream stream=Stream.of(1,2,3,4);

        //Stream()
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        //Make stream with Arraylist
        Stream<Integer> streamn=arrayList.stream();

        //Arrays to stream
        Arrays.stream(new int[]{10});

        //Stream<Object>
        Stream<Object> objectStream=Stream.builder().build();



    }
}
