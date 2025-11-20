package company;

import java.util.*;
import java.util.stream.Collectors;

public class Accolite {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp("A",10,1000,"CS"));
        empList.add(new Emp("B",20,2000,"Civil"));
        empList.add(new Emp("C",30,3000,"IT"));
        empList.add(new Emp("D",40,4000,"Mechnical"));

        // name, age, salary,dep
       // name of the emp each dept whose max(salary) where age >35
        // filter means where method reference not allowed
        Map<Integer, Object> collect1 = empList.stream().filter(e -> e.getAge() > 35).collect(Collectors.groupingBy(Emp::getAge, Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)),opt -> opt.map(Emp::getName).orElse(null))));

        System.out.println(collect1);

        String word ="aaaabbbvvvfffrrssserrkkksr";
        Map<Character, Long> collect = word.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect.entrySet());


        Map<Character, Character> map = new HashMap<>();
        map.put('A', 'X');
        map.put('B', 'C');
        map.put('C', 'E');
        map.put('E', 'F');
        map.put('F', 'Y');
        map.put('M', 'A');

        for (Character start : map.keySet()) {
            List<Character> chain = new ArrayList<>();
            Character curr = start;

            while (curr != null) {
                chain.add(curr);
                curr = map.get(curr);
            }

            System.out.println(chain);
        }
    }
}


class Emp{
    private String name;
    private int age;
    private double salary;

    private String dept;

    public Emp(String name, int age, double salary,String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

