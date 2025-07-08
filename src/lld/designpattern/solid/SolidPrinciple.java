package lld.designpattern.solid;

public class SolidPrinciple {
    public static void main(String[] args) {
        Employee employee1  =new ContractEmployee("Neeraj",1500);
        Employee employee2 = new FullTimeEmployee("Raghu",2000);
        Employee manager  = new Manager("Ananda",5000);
        System.out.println("Emp Name --> "+ employee1.getName() +" Salary "+employee1.getSalaryCalcutaion());
        System.out.println("Emp Name -->"+employee2.getName() +" Salary "+employee2.getSalaryCalcutaion());
        System.out.println("Emp Name -->"+manager.getName() + " Salary  "+manager.getSalaryCalcutaion());
    }
}
