package java8;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.*;
public class PredicateDemo {
    public static void main(String[] a){
        //takes one argument and return boolean   (Condition checking)
        Predicate<Integer> pi=i->i%2==0;
        System.out.println(pi.test(5));
        System.out.println(pi.test(4));

        //check length is greater than or not
        String arr[]={"Neeraj","Kumar","keshri","soun"};
        Predicate<String> stringPredicate=s->s.length()%2==0;
        for(String s1:arr){
            if(stringPredicate.test(s1)){
                System.out.println(s1);
            }
        }

        //For custom string
        Predicate<Product> productPredicate=p->p.price>100;
        List<Product> productList=new ArrayList<>();
        productList.add(new Product("Neeraj",100));
        productList.add(new Product("sonu",101));
        productList.add(new Product("ram",201));
        for(Product p:productList) {
            if(productPredicate.test(p)){
                System.out.println(p.name+":" +p.price);
            }
        }


        //Predicate Joining (and,or,negate)
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


        //Function
        Function<Integer,Integer> function=i->i*i;
        System.out.println("Function functional interface...");
        System.out.println(function.apply(4));

        Function<String,Integer> function1=s->s.length();
        System.out.println(function1.apply("test"));

        Function<String,String> function2=s->s.toUpperCase();
        System.out.println(function2.apply("test"));

        PredicateDemo predicateDemo=new PredicateDemo();
        predicateDemo.functionInterfaceWith();

        //Function chaining
       // function1.andThen(f2).apply(i);
        //function1.compose(f2).apply(i);

        //to print or consume value.
        Consumer<String> c= System.out::println;
        c.accept("test");
       // c.andThen(c2).andThen(c3);


        //Supplier<R>
        Supplier<Date> s=()->new Date();
        System.out.println(s.get());
        System.out.println(s.get());


        //BiPredicate(When two argument required..)
        BiPredicate<Integer,Integer> biPredicate=(num,b)->num+b%2==0;
        System.out.println(biPredicate.test(1,2));

    }

    public void functionInterfaceWith() {
        Student s[]={new Student("Neeraj",100),
                new Student("Sonu",101),
                new Student("Sita",201),
                new Student("Ram",301)
        };

        Function<Student,String> function3=e->{
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
}
