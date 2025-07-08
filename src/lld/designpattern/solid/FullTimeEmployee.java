package lld.designpattern.solid;

// open and close & Liskov new types of employees without changing base class
public class FullTimeEmployee extends Employee{


    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalaryCalcutaion() {
        return getSalary() * 10;
    }
}
