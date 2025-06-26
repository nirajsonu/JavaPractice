import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DellioteInterview {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(100,"Neeraj",1000));
        employees.add(new Employee(100,"Vinay",3000));
        employees.add(new Employee(200,"Sonu",2000));

         Map<Integer,List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getEid));
         System.out.println(map);
    }
}

class Employee{
    private int eid;
    private String eName;
    private double salary;

    public Employee(int eid, String eName, double salary) {
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
}