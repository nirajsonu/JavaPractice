package javaversions.java17;


// jakarta EE
// Springboot  3 + and Spring 6+

public class Java17 {
    public static void main(String a[]){
        // pattern matching for switch statements
        Employee obj = new Employee(12,"Neeraj");
        int age  = obj.age();
        String name = obj.name();
        System.out.println(age);
        System.out.println(name);

    }
}

// record class
record Employee(int age,String name){}

// sealed class
sealed class Animal permits Dog, Cat {}
final class Dog extends Animal {}
final class Cat extends Animal {}
