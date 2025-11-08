package java8;

import java.util.List;

// It is an interface that is used to split interface in parallel processing.
public class Spliterator {
    public static void main(String[] args) {
        List<String> nameList = List.of("Neeraj","Sonu","Notebook","Pencil");
        java.util.Spliterator spliterator = nameList.spliterator();

        // Print one
        spliterator.tryAdvance(System.out::println);

        // Print Remaining
       spliterator.forEachRemaining(System.out::println);

       // try Split
        java.util.Spliterator spliterator1 = spliterator.trySplit();

    }
}
