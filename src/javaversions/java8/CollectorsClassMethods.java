package javaversions.java8;



import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

// it is Accumulators, downstream
public class CollectorsClassMethods {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Neeraj","Ranchi",15000l,"Computer science"));
        employeeList.add(new Employee("Raghu ","Hyderabad",25000l,"civil"));
        employeeList.add(new Employee("Mahesh","pune",10000l,"electrical"));
        employeeList.add(new Employee("Abhishek","bengalure",5000l,"chemical"));

        // Collectors.toList(), toMap(),toSet()
        employeeList.stream().map(Employee::getAddress).collect(Collectors.toList());
        employeeList.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary));

        // Collectors.toCollection()
        employeeList.stream().map(Employee::getAddress).collect(Collectors.toCollection(HashSet::new));

        // Collectors.joining
        String collect = employeeList.stream().map(Employee::getName).collect(Collectors.joining("-"));
        String Delimator = employeeList.stream().map(Employee::getName).collect(Collectors.joining(":", "{", "}"));
        System.out.println(Delimator);

        // Collectors.groupBy, Collectors.averagingLong(), averagingInt,averagingDouble
        employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.averagingDouble(Employee::getSalary)));

        // Collectors.partitionBy
        employeeList.stream().collect(Collectors.partitioningBy(e-> e.salary> 2000));
        System.out.println(employeeList);

        // Collectors.summary statics
        LongSummaryStatistics collect1 = employeeList.stream().collect(Collectors.summarizingLong(Employee::getSalary));
        System.out.println(collect1);

        // Collectors.counting()
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting())));

        // Collectors.summingInt(),summingDouble().
        employeeList.stream().mapToDouble(Employee::getSalary).sum();

        //Collectors.mapping()
        employeeList.stream().map(Employee::getSalary).collect(Collectors.toList());
        Map<Long, List<String>> collect5 = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("mapping "+collect5.entrySet());


        // maxBy,minBy takes compartor
        Optional<Employee> collect2 = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(collect2.get());

        // reducing
        Long totalSalary = employeeList.stream()
                .collect(Collectors.reducing(0L,
                        Employee::getSalary,
                        Long::sum));

        System.out.println(totalSalary);

        // 3rd highest salary
        Map<String, Optional<Employee>> thirdHighestPerName =
                employeeList.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        emp -> emp.stream()
                                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                .skip(2)   // skip top 2
                                                .findFirst() // get 3rd highest
                                )
                        ));


        System.out.println("last -->" +thirdHighestPerName);

        List<Long> collect3 = employeeList.stream().map(Employee::getSalary).collect(Collectors.toList());
        System.out.println(collect3);

        List<Employee> collect4 = employeeList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect4);

    }


}


class Employee implements Comparable<Employee>{
    String name;
    String address;

    Long salary;

    String department;



    public Employee(String name, String address,Long salary,String department) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Long.compare(this.salary,o.salary);
    }
}
