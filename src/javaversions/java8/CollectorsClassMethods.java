package javaversions.java8;



import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

// it is Accumulators, downstream
public class CollectorsClassMethods {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Neeraj","Ranchi",15000l));
        employeeList.add(new Employee("Raghu ","Hydrabad",25000l));
        employeeList.add(new Employee("Neeraj","Ranchi",15000l));
        employeeList.add(new Employee("Raghu ","Hydrabad",25000l));

        // Collectors.toList(), toMap(),toSet()
        employeeList.stream().map(Employee::getAddress).collect(Collectors.toList());
        //employeeList.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary));

        // Collectors.toCollection()
        employeeList.stream().map(Employee::getAddress).collect(Collectors.toCollection(HashSet::new));

        // Collectors.joining
        String collect = employeeList.stream().map(Employee::getName).collect(Collectors.joining("-"));
        String Delimator = employeeList.stream().map(Employee::getName).collect(Collectors.joining(":", "{", "}"));
        System.out.println(Delimator);

        // Collectors.groupBy, Collectors.averagingLong(), averagingInt,averagingDouble
        employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.averagingDouble(Employee::getSalary)));

        // Collectors.partitionBy
        employeeList.stream().collect(Collectors.partitioningBy(e-> e.salary> 2000));
        System.out.println(employeeList);

        // Collectors.summary statics
        LongSummaryStatistics collect1 = employeeList.stream().collect(Collectors.summarizingLong(Employee::getSalary));
        System.out.println(collect1);

        // Collectors.counting()
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.counting())));

        // Collectors.summingInt(),summingDouble().
        employeeList.stream().mapToDouble(Employee::getSalary).sum();

        //Collectors.mapping()
        employeeList.stream().map(Employee::getSalary).collect(Collectors.toList());


        // maxBy,minBy takes compartor
        Optional<Employee> collect2 = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(collect2.get());

        // reducing
        Long totalSalary = employeeList.stream()
                .collect(Collectors.reducing(0L,
                        Employee::getSalary,
                        Long::sum));

        System.out.println(totalSalary);

    }

    public static class FunctionalInterfaceDemo {
        //one abstract method present in functional interface.(SAM Interface)
        //Functional interface example runnable-->run(),callable-->call(),comparable-->compareTo(),comparator-->compare().
        public static void main(String[] a){
            //way 1st
            customInterface customInterface=(x, y)->(x^y);
            customInterface.m2();
            System.out.println(customInterface.m1(10,20));

            custom c=()->System.out.println("hello");

           List<Integer> integerList = List.of(10,20,90,91,108,110);
            OptionalDouble average = integerList.stream().filter(x->x<100 && x<90).mapToDouble(x -> x).average();
            System.out.print(average.getAsDouble());

            //way 2nd
            FunctionalInterfaceDemo.customInterface i1=Integer::sum;
            System.out.println(i1.m1(100,200));

            //takes one argument and return boolean   (Condition checking)
            Predicate<Integer> pi= i->i%2==0;
            System.out.println(pi.test(5));
            System.out.println(pi.test(4));

            //check length is greater than or not
            String[] arr ={"Neeraj","Kumar","keshri","soun"};
            Predicate<String> stringPredicate=s->s.length()%2==0;
            for(String s1:arr){
                if(stringPredicate.test(s1)){
                    System.out.println(s1);
                }
            }

            //For custom string
            Predicate<Product> productPredicate= p->p.price>100;
            List<Product> productList=new ArrayList<>();
            productList.add(new Product("Neeraj",1000,"Male","Computer Science"));
            for(Product p:productList) {
                if(productPredicate.test(p)){
                    System.out.println(p.name+":" +p.price);
                }
            }

            //Predicate Joining (and,or,negate) takes an input and return as boolean.
            int x[]={10,15,20,25,8};
            Predicate<Integer> predicate=i->i%2==0;
            Predicate<Integer> predicate1=i->i>10;
            for(int x1:x){
                //and
                if(predicate.and(predicate1).test(x1)){
                    System.out.println(x1);
                }

                //or
                if(predicate.or(predicate1).test(x1)){
                    System.out.println(x1);
                }

                //negate(opposite)
                if(predicate.negate().test(x1)){
                    System.out.println(x1);
                }
            }

            Predicate<String> startsWithA = s -> s.startsWith("A");
            Predicate<String> endsWithX = s -> s.endsWith("x");

            Predicate<String> startsWithAAndEndsWithX = startsWithA.and(endsWithX);

            System.out.println(startsWithAAndEndsWithX.test("Aardvax"));  // Output: true
            System.out.println(startsWithAAndEndsWithX.test("Ajax"));  // Output: true
            System.out.println(startsWithAAndEndsWithX.test("Apex"));  // Output: false


            //Function
            Function<Integer,Integer> function= i->i*i;
            System.out.println("Function functional interface...");
            System.out.println(function.apply(4));

            Function<String,Integer> function1= String::length;
            System.out.println(function1.apply("test"));

            Function<String,String> function2= String::toUpperCase;
            System.out.println(function2.apply("test"));

            FunctionalInterfaceDemo predicateDemo=new FunctionalInterfaceDemo();
            predicateDemo.functionInterfaceWith();



            //Function chaining
            // function1.andThen(f2).apply(i);
            //function1.compose(f2).apply(i);


            //to print or consume value not return anything.
            Consumer<String> consumer= System.out::println;
            consumer.accept("test");
            //c.andThen(c2).andThen(c3);


            //Supplier<R> is a lambda no argument and return a value.
            Supplier<Date> s= Date::new;
            System.out.println(s.get());

           // When two argument required..
            //BiConsumer
            BiConsumer<Integer,Integer> biConsumer=(number1, number2)->{
                int i = number1 + number2;
                System.out.println(i);
            };
            biConsumer.accept(10,20);

            //Bi-Predicate
            BiPredicate<Integer,Integer> biPredicate=(num,b)->num+b%2==0;
            System.out.println(biPredicate.test(1,2));

            UnaryOperator<Boolean> operator = UnaryOperator.identity();
            System.out.println(operator.apply(true));


            TriFunction<Integer,Integer,Integer,Integer> triFunction = (w, y, z)-> w+y+z;
            System.out.println(triFunction.apply(10,20,30));
        }

        public void functionInterfaceWith() {
            Student s[]={new Student("Neeraj",100),
                    new Student("Sonu",101),
                    new Student("Sita",201),
                    new Student("Ram",301)
            };

            Function<Student,String> function3= e->{
                int marks=e.marks;
                String grade="";
                if(marks>=80) grade="A[Disctiction]";
                else if(marks>=60) grade="B[First grade]";
                else if(marks>=40) grade="C[Second grade]";
                else grade="D[Failed]";
                return grade;
            };

            for(Student s1:s){
                System.out.println(s1.name + s1.marks + function3.apply(s1));
            }


        }

        class Student {
            public String name;
            public int marks;
            public Student(String name,int marks){
                this.name=name;
                this.marks=marks;
            }


        }

        @FunctionalInterface
        public interface  customInterface{
            int m1(int a,int b);

            default void  m2(){
                System.out.println("deafult method");
            }
        }

        @FunctionalInterface
        public interface custom{
            void m1();
        }

        @FunctionalInterface
        public interface TriFunction<A,B,C,R>{
            R apply(A a, B b, C c);
        }
    }
}
