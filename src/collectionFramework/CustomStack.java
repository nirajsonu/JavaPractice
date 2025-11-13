package collectionFramework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomStack {
    public static void main(String a[]){
        List<Employee> l = new ArrayList<>();
        l.add(new Employee("Emp1", 25, 15000, "B"));
        l.add(new Employee("Emp2", 35, 35000, "A"));
        l.add(new Employee("Emp3", 20, 12000, "C"));
        l.add(new Employee("Emp4", 40, 45000, "A"));
        Map<String, Double> map = l.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGrade, HashMap::new,
                        Collectors.averagingLong(Employee::getSalary)
                ));

        System.out.println(map);
    }


}

class Employee {
    private String name;
    private int age;
    private long salary;
    private String grade;

    public Employee(String name, int age, long salary, String grade) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public String getGrade() {
        return grade;
    }
}
