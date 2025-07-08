package lld.designpattern.solid;

public class Manager extends Employee implements BonusEligible{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary()* 15*2;
    }

    @Override
    public double getSalaryCalcutaion() {
        return getSalary() * 15;
    }
}
