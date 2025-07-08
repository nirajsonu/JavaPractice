package lld.designpattern.solid;

public class ContractEmployee extends Employee{

    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalaryCalcutaion() {
        return getSalary() * 5;
    }
}
