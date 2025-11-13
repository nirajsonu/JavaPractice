package javaversions.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {


    // variable inside lamda
    int counter = 0;



    // Atomic integer used
    static AtomicInteger atomicInteger = new AtomicInteger(10);
    Runnable runnable = () ->{
        counter = counter ++;
    };

    static int result = 0;
    Runnable runnable1 =() ->{
        result = atomicInteger.incrementAndGet();
    };

    public static void main(String[] args) {
        // static method
        Function<String, Integer> convertorFuture = Integer::parseInt;
        System.out.println(convertorFuture.apply("16"));

        // instance method
        Consumer<String> consumer = String::length;
        consumer.accept("test");

        // Constructor reference
        Supplier<List<String>> supplier = ArrayList::new;
        List<String> list = supplier.get();
        list.add("Neeraj");
        list.add("Sonu");
        System.out.println(list.toString());



    }
}
