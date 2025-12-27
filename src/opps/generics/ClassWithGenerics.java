package opps.generics;

// use of generics is type safety and resolved type casting problem.
// <T> it is a type parameter.
// class Test<T> and class Test<T extends X>
// class Test<T extends Number & Runnable> valid
// class Test<T extends String & Number> invalid one than one class we cannot extends in java
// class Test<T extends Runnable & Serializable
// method level generic.
 public class ClassWithGenerics {
    public static void main(String[] args) {
        MyCustomHashMap<Integer,String> myCustomHashMap=new MyCustomHashMap<>();
        myCustomHashMap.setObject(10);
        myCustomHashMap.setObject1("Neeraj");
        System.out.println( myCustomHashMap.getObject());
        System.out.println( myCustomHashMap.getObject1());

        // Unbounded Wildcard
        // Class<?>

        // Upper Bounded
        // Class <? extends Demo >

        // Lower bounded wildcard
        // Class <? super Demo >

        // generics methods
        // methodOne(ArrayList<> String l)

    }
}

class MyCustomHashMap<key,value>{
private key object;
private value object1;

    public key getObject() {
        return object;
    }

    public void setObject(key object) {
        this.object = object;
    }

    public value getObject1() {
        return object1;
    }

    public void setObject1(value object1) {
        this.object1 = object1;
    }
}