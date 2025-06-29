package collectionFramework;

// Use for Sorting natural order and customized order

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CompartorAndComparable {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Neeraj", "Keshri", "Soun", "Shubam"));
        Collections.sort(nameList);
        System.out.println(nameList);

        Collections.sort(nameList, Comparator.reverseOrder());
        System.out.println(nameList);

        List<Department> departmentList = new ArrayList<>(List.of(new Department("Computer Science", 1),
                new Department("Electronics ",1)));


        // for multiple comparator
        Comparator<Department> departmentComparator = Comparator.comparingInt(Department::getDid).thenComparing(Department::getdName);
        List<Department> collect = departmentList.stream().sorted(departmentComparator).collect(Collectors.toList());
        System.out.println(collect);

        Comparator<String> stringComparotor = Comparator.comparing(String::length);
        List<String> sortedString = nameList.stream().sorted(stringComparotor).collect(Collectors.toList());
        System.out.println(sortedString);


        // Arrays
        int arr[]  = {10,20,5,34,23};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.stream(arr).sorted().mapToObj(x -> x).collect(Collectors.toList()).forEach(System.out::print);
        Arrays.stream(arr).sorted().boxed().collect(Collectors.toList()).forEach(System.out::println);


        // String
        String name = "Neeraj";
        name.chars().
                mapToObj(c->(char) c).
                sorted(Comparator.comparingInt(c->Character.toLowerCase(c))).
                collect(Collectors.toList()).
                forEach(System.out::println);

        // double
        Double d = 100.0;
        DoubleStream.of(d);

        // int
        int x=100;
        IntStream.of(x);

        long l = 20l;
        LongStream.of(l);


        // Map
        Map<Integer,String> programmingLangMap = new HashMap<>();
        programmingLangMap.put(1,"Python");
        programmingLangMap.put(4,"Java");
        programmingLangMap.put(3,"C++");
        programmingLangMap.put(2,"Go");


        System.out.println("===========================");
        Map<Integer, String> filteredMap = programmingLangMap.entrySet().stream().filter(key -> key.getKey() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filteredMap.entrySet());

        System.out.println("===========================");

        programmingLangMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("============================");
        programmingLangMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Integer,Department> departmentMap = new HashMap<>();
        departmentMap.put(1,new Department("Web Dev",1));
        departmentMap.put(2,new Department("AI",2));
        departmentMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        departmentMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Department::getdName))).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        departmentMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Department::getdName))).forEach(System.out::println);
    }
}

class Department{
    private String dName;
    private int did;

    Department(String dName,int did)
    {
        this.did= did;
        this.dName = dName;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dName='" + dName + '\'' +
                ", did=" + did +
                '}';
    }
}
