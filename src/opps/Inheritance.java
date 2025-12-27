package opps;

import java.util.ArrayList;
import java.util.List;
// if a child should throw checked exception parent also need to throw exception but when parent throw child no need to throw
// Static methods cannot be overridden, only hidden.
// cannot override variables
public class Inheritance {
    public static void main(String[] args) {
        Baccha b = new Baccha();
        Parent p1 = new Parent();
        // child cannot hold parent reference
        Baccha b1 = (Baccha) new Parent(); // opps.Parent cannot be cast to class opps.Baccha (opps.Parent and opps.Baccha are in unnamed module of loader 'app')
        // parent can hold child reference
        Parent p = new Baccha();


        // compile time error
        /*List<Baccha> bacchaList = new ArrayList<Parent>();
        List<Parent> parentList = new ArrayList<Baccha>();*/

        List<? extends Parent> parentsList= new ArrayList<Baccha>();  // upper bounded
        List<? super Baccha> children = new ArrayList<Parent>(); //  Lower bounded
    }
}


class Parent {

    Parent (){
        this("Constructor");
        System.out.println("Parent Class Default Constructor");
    }

    Parent (String s){
        System.out.println("Parent Class Param  "+s);
    }
}

class Baccha extends Parent {
    //super(...) → invokes a parent class constructor
   //this(...) → invokes another constructor in the same class
   // called in both parent and Baccha class
    Baccha() {
        this("Constructor");
        System.out.println("Baccha Class Default Constructor");
    }

    Baccha(String s) {
        System.out.println("Bachha Class Param Constructor " + s);
    }
}

