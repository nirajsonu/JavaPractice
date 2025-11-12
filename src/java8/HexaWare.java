package java8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HexaWare {
    public static void main(String[] args) {
        List<String>  countryList = List.of("India","Austrailia","America","USA");
        Map<Character, List<String>> collect = countryList.stream().collect(Collectors.groupingBy(x -> Character.toLowerCase(x.charAt(0))));
        System.out.println(collect);

       int max=countryList.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(max);

        List<String> collect1 = countryList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

        List<String> sorted = countryList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}
