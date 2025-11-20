package company;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HexaWare {
    public static void main(String[] args) {
        List<String>  countryList = List.of("India","Austrailia","America","USA");
        Map<Character, List<String>> collect = countryList.stream().collect(Collectors.groupingBy(x -> Character.toLowerCase(x.charAt(0))));
        System.out.println(collect);
    }
}
