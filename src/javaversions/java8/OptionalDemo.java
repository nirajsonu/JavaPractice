package javaversions.java8;



import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;


//findById()
public class OptionalDemo {
    public static void main(String a[]) throws Throwable {
        //To Deal null values.
        //get(),of(),ifPresent()//orElse//orElseget()
        int x[]={100,19,11,45,69,45};
        int y[]={100,45,1,32,31};


        //Find first element
        OptionalInt first = Arrays.stream(x).findFirst();

        //findAny
        OptionalInt last=Arrays.stream(x).findAny();
        System.out.println(first.getAsInt());
        System.out.println(last.getAsInt());
        Arrays.stream(x).distinct().forEach(System.out::print);
        System.out.println();

        Optional<Integer> intOptional=Optional.of(45);
        System.out.println(intOptional);


        Optional<Employee> optionalEmployee=Optional.of(new Employee("Neeraj","Ranchi",100l,"CS"));
       System.out.println(optionalEmployee.get().address);

        //to get the value of the optional
        System.out.println(intOptional.get());

        //or else
        System.out.println(intOptional.orElse(Integer.valueOf("45")));

        //or elseget()
        intOptional.orElseGet(()->1);

        //or else
        intOptional.orElseThrow((()-> new NullPointerException()));

        Optional<String> optionalS=Optional.ofNullable("Neeraj");
        System.out.println(optionalS);
        Optional<Integer> optional=Optional.empty();
        System.out.println(optional);

        System.out.println(optional.isPresent());
     //  System.out.println(optional.isEmpty());




    }
}

