package java8;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EnhanceCollections {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.forEach(n->System.out.println(n));
        System.out.println("=========================");
        names.removeIf(n->n.length()>5);
        names.forEach(n->System.out.println(n));


        List<String> immutableList = List.of("Neeraj","Sonu","Mamta");
        Set<String> immutableSet = Set.of("Neeraj","sounu");
        Set.copyOf(immutableList);



    }

    // Repeatable Annotations

    @Author("Alice")
    @Author("Bob")
    public class Book{

    }
}

@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Authors {
    Author[] value();
}
