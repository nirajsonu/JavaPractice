import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String name = "microservices";
        Map<Character, Long> collect = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Character, Long> entry : collect.entrySet()) {
       //     System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        System.out.println("------------- Uppercase --------------");
        name.chars().mapToObj(c->(char) c).map(Character::toUpperCase).count();

       // System.out.println(" ");

        //map will take function as argument
      //  name.chars().mapToObj(c->(char) c).map(c->String.valueOf(c).startsWith("m")).collect(Collectors.toList()).forEach(System.out::println);

        long vowel = name.chars().mapToObj(c -> (char) c).filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u').count();
       // System.out.print(vowel);

       // name.chars().mapToObj(c->(char) c).sorted().collect(Collectors.toList()).forEach(System.out::println);

        name.chars().mapToObj(c->(char) c).sorted(Comparator.comparingInt(Character::toLowerCase)).forEach(System.out::print);

        System.out.println("");

        name.chars().mapToObj(c->(char) c).distinct().forEach(System.out::print);

        

    }
}


