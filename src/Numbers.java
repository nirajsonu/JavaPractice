import java.io.Serializable;
import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        int numbers[] = {11,31,45,23,11};
        Integer i = Arrays.stream(numbers).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        System.out.println(list instanceof RandomAccess);
        System.out.println(list instanceof Cloneable);
        System.out.println(list instanceof Serializable);
        System.out.println(integerLinkedList instanceof RandomAccess);
    }
}
