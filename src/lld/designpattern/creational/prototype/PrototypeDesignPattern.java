package lld.designpattern.creational.prototype;

import lld.designpattern.creational.prototype.Student;

//prototype design pattern used clone method to create objects
public class PrototypeDesignPattern {
    public static void main(String a[]){
        Student student = new Student("Neera j",28,100);
        Student clone = (Student) student.clone();
        System.out.println(student.hashCode());
        System.out.println(student);
        System.out.println(clone.hashCode());
        System.out.println(clone);
    }
}


