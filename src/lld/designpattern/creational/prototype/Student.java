package lld.designpattern.creational.prototype;

public class Student implements ProtoType{

    private String name;
    private int age;
    private int roll;

    public Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    @Override
    public ProtoType clone() {
        return new Student(name,age,roll);
    }

    @Override
    public String toString() {
        return name + age + roll;
    }
}
