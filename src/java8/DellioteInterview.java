package java8;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DellioteInterview {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(100, "Neeraj", 1000));
        employees.add(new Employee1(200, "Sonu", 2000));
        employees.add(new Employee1(100, "Vinay", 3000));

        Map<Integer, List<Employee1>> map = employees.stream().collect(Collectors.groupingBy(Employee1::getEid));
        //  System.out.println(map);
        List<Employee1> collect = employees.stream().sorted().collect(Collectors.toList());
     //   System.out.println(collect);

      //  Comparator<Employee1> comparing = Comparator.comparing(Employee1::geteName);


        //dropWhile — skips from start while condition is true
        employees.stream().dropWhile(employee1 -> employee1.getEid()==100).forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++");

       // takeWhile — includes from start while condition is true
        employees.stream().takeWhile(employee1 -> employee1.getEid() == 100).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++");

        // peek
        employees.stream().peek(employee1 ->employee1.getEid()).forEach(System.out::println);

    }
}

class Employee1 implements Comparable<Employee1>,Comparator<Employee1>{
    private int eid;
    private String eName;
    private double salary;

    public Employee1(int eid, String eName, double salary) {
        this.eid = eid;
        this.eName = eName;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee1 o) {
        int nameComparison = o.geteName().compareTo(this.eName);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.eid, o.getEid());
        }
    }

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return o1.geteName().compareTo(o2.geteName());
    }
}
