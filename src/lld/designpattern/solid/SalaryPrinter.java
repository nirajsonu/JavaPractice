package lld.designpattern.solid;

// Dependency inversion
public class SalaryPrinter {
    public void printSalary(Employee employee) {
        System.out.println(employee.getName() + "'s salary: " + employee.getSalaryCalcutaion());
    }
}
