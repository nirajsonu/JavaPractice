package javaversions.java8;

import java.util.*;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Examples {
    public static void main(String a[]){
        Logger logger = Logger.getLogger(Java8Examples.class.getName());

        // reducing takes binary operator
        List<Integer> integerList = Arrays.asList(10,5,4,8,3,7);
        Integer sum = integerList.stream().reduce(0, Integer::sum);
        Integer max = integerList.stream().reduce(Integer::max).get();
        Optional<Integer> min = integerList.stream().reduce(Integer::min);
        logger.info(""+sum);
        logger.info(""+max);
        logger.info(""+min.get());


        // it will partition the stream with two parts
        Set<Map.Entry<Boolean, List<Integer>>> entries = integerList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)).entrySet();
        System.out.println(entries);


        // Collectors.collectingAndThen();


        //Collectors.teeing();


        //Collectors.maxBy();
        Integer i2 = integerList.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        System.out.println(i2);
        Integer i3 = integerList.stream().max(Integer::compareTo).get();
        System.out.println(i3);
        Integer i4 = integerList.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(i4);

        // Collectors.minBy()
        Integer i1 = integerList.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
        System.out.println(i1);
        Integer i = integerList.stream().min(Integer::compareTo).get();
        System.out.println(i);

        // terminal operator
        // for each,collect, reduce, count.

        // intermediate operator
        // map,flatmap,distinct,filter,

        // short circuit operator

    }

    private static void mergeTwoLists() {
        List<String> mergeList;
        List<String> list1=new ArrayList<>();
        list1.add("Neeraj");
        list1.add("Sonu");
        List<String> list2=new ArrayList<>();
        list2.add("Keshri");
        mergeList= Stream.of(list1, list2).flatMap(Collection::stream).sorted().collect(Collectors.toList());
        System.out.println(mergeList);
    }

    private void allOtherOperations() {
        List<Product> productList= new ArrayList<>();
        productList.add(new Product("Neeraj",1000,"male","HR"));
        productList.add(new Product("geeta",2000,"female","IT"));
        productList.add(new Product("prince",4000,"male","Sales"));
        productList.add(new Product("ashis",8000,"male","manager"));
        productList.add(new Product("sonu",1600,"male","designer"));
        //map() //toList
        List<String> collect = productList.stream().map(x -> x.name).collect(Collectors.toList());
        List<String> collect1 = productList.stream().map(x -> x.dept).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);

        //toSet
        System.out.println("--------To Set-------");
        productList.stream().map(Product::getGender).collect(Collectors.toSet()).forEach(System.out::println);

        //toMap
        Map<String,Integer> nameAndPrice= productList.stream().collect(Collectors.toMap(Product::getName,Product::getPrice));
        System.out.println(nameAndPrice);


        //flat map()
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> innerList=new ArrayList<>();
        List<Integer> innerList1=new ArrayList<>();
        List<Integer> innerList2=new ArrayList<>();
        innerList.add(1);
        innerList.add(5);
        innerList1.add(4);
        innerList1.add(2);
        innerList2.add(3);
        innerList2.add(3);
        lists.add(innerList);
        lists.add(innerList1);
        lists.add(innerList2);
        System.out.println("------Normal map------");
        lists.stream().map(x->x).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------Falt map------");
        lists.stream().flatMap(List::stream).map(x->x+1).collect(Collectors.toList()).forEach(System.out::println);

        //filter()
        productList.stream().filter(p->p.price==101).map(p->p.price=201).collect(Collectors.toList()).forEach(System.out::println);

        //chaining filter
        System.out.println("Multiple time filter");
        productList.stream().filter(p->p.getPrice()>100).filter(x->x.getName().equals("sonu")).collect(Collectors.toList()).forEach(System.out::println);

        //filter by boolean method
        // productList.stream().filter(i->new Product().yesOrNo()).collect(Collectors.toList()).forEach(System.out::println);


        //comparison in data
        Map<Integer,String> newMap=new HashMap<>();
        newMap.put(100,"N");
        newMap.put(10,"S");
        newMap.put(300,"E");

        //map compare
        Integer key = newMap.entrySet().stream().max(Map.Entry.comparingByKey()).get().getKey();
        Integer value=newMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(key);
        System.out.println(value);


        //integer of list compare
       // List<Integer> list = List.of(1,2,3,45);
       // int x=list.stream().max(Integer::compare).get();
      //  System.out.println(x);

        //string of list compare
        List<String> strings=Arrays.asList("Neeraj","Kumar","keshri");
        String max=strings.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println(max);

        //set of integer compare
       // Set<Integer> integerSet=Set.of(23,12,34,22);
       // System.out.println(integerSet.stream().max(Integer::compare).get());

        //group by in hashmap
        Map<String, Long> map=productList.stream().collect(Collectors.groupingBy(Product::getGender,Collectors.counting()));
        System.out.println(map);

        //groupby
        String fruits[]={"Apple","Banana","Papya","Banana","tomato"};
        Map<String,Long>  result =  Arrays.stream(fruits).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
        long count = productList.stream().count();
        System.out.println(count);

        //average
        Map<String,Double> result2=productList.stream().collect(Collectors.groupingBy(Product::getName,Collectors.averagingInt(Product::getPrice)));
        System.out.println(result2);

        //countSum
        // productList.stream().collect(Collectors.groupingBy(Product::getPrice,Collectors))

        //reduce  (3, 1st assign any value,first,secondvalue)



        //distict
        productList.stream().map(Product::getPrice).distinct().forEach(System.out::print);



        //Traditional method..
        for(Product p:productList){
            //System.out.println(Integer.parseInt(p.getPrice()) +10);
        }



        //Using Java 8
        System.out.println("---------------------------------");
        System.out.println("Using java 8");
        System.out.println("---------------------------------");
        productList.stream().filter(p->p.name.startsWith("S")).map(p->p.name).collect(Collectors.toList()).forEach(System.out::println);
        productList.stream().map(p->p.price +100).collect(Collectors.toList()).forEach(System.out::println);

        //limit,skip
        List<Product> l= productList.stream().sorted((o1,o2)->(int)o1.price -o2.price).limit(2).collect(Collectors.toList());
        //  System.out.println(l);

        //using comparing
        Collections.sort(productList, Comparator.comparing(e -> e.price));
        //  System.out.println(productList);


        //Filter
        List<Integer> intergerList=new ArrayList<>();
        for(int i=0;i<6;i++){
            intergerList.add(i);
        }
       // List<Integer> list2=list.stream().filter(number->number%2==0).collect(Collectors.toList());
        //System.out.print(list2);

        //Map
        System.out.println("-------Map-------------");
        productList.stream().map(newPrice->newPrice.price+100).collect(Collectors.toList()).forEach(System.out::println);


        //FlatMap
        System.out.println("-------------FlatMap------------");


        //iterate
        List<Integer> iterate= Stream.iterate(1,i->i+1).limit(10).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        // Summary statics
        List<Integer> priceList=productList.stream().map(e->e.price).collect(Collectors.toList());
        int maxPrice=priceList.stream().mapToInt(y->y).summaryStatistics().getMax();
        System.out.println(maxPrice);

        //sum() IntStream()
        IntStream intStream=IntStream.of(123,100);
        System.out.println(intStream.sum());
        // System.out.println(intStream.average());

        IntStream.range(1,10).forEach(System.out::print);
        IntStream.rangeClosed(1,10).forEach(System.out::print);


        //limit()
        productList.stream().filter(p->p.getPrice()>100).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        productList.stream().filter(p->p.getPrice()>100).limit(1).forEach(System.out::println);

        //iterator create infinite number of streams
      //  Stream.iterate(0,n->n+1).limit(1).forEach(v->System.out.println(x));

        //generate create infinite number of streams takes a supplier
        Stream.generate(new Random()::nextInt).limit(2).forEach(System.out::println);

        int[] number ={1,2,3,4,5,6};
        int odd=Arrays.stream(number).filter(i->i%2==0).sum();
        System.out.println(odd);



        List<Integer> integers=Arrays.asList(10,20,30,40);
        System.out.println("Peek element of the list");
        integers.stream().peek(integer -> {}).collect(Collectors.toList()).forEach(System.out::println);

        Stream.of(1,2).forEachOrdered(System.out::println);


        List<person> personAge = new ArrayList<>();
        personAge.add(new person(10));
        personAge.add(new person(40));
        personAge.add(new person(50));
        personAge.add(new person(90));

        personAge.stream().collect(Collectors.groupingBy(person -> {
            int age = person.getAge();
            if (age <= 18) return "0-18";
            else if (age <= 35) return "19-35";
            else if (age <= 50) return "36-50";
            else return "Out of range";
        }));
    }


    class person{
        private int age;
        person(int age){
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    private static void checkForArmStrongNumberWithJava8(List<Integer> list) {
        List<Integer> collect = list.stream().filter(x -> checkForArmStrongNumber(121)).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static boolean checkForArmStrongNumber(int number) {
        int sum=0,reminder=0;
        while(number>0){
            number=number/10;
            reminder=number%10;
            sum=sum*sum+reminder;
        }
      /*  if(sum==number){
            return true;
        }else{
            return false;
        }*/
        return false;
    }

    private static void lenghthLongestString(String[] fruit) {
        int i = Arrays.stream(fruit).mapToInt(string -> string.length()).max().orElse(0);
        System.out.println("longest fruit is "+i);
    }

    private static void countVolwelInString() {
        String word="aeiou";
        System.out.println("Total Number of vowels in the  is->"+word.chars().filter(c->c=='a'|| c=='e' || c=='i' || c=='o' || c=='u').count());
        Map<Character, Long> collect2 = word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect2);
    }

    private static void getCountFreqencyOfCharaters() {
        String str = "aabc";
        //java 8
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        for(Map.Entry<Character, Long> map: frequencyMap.entrySet()){
            System.out.println(map.getKey()+"-->"+map.getValue());
        }
    }

    private static void fetchTheSammlestElement(int[] x) {
        //skip to skip elements
        int secondSmallestElement = Arrays.stream(x).distinct().sorted().skip(0).findFirst().orElseThrow(()->new IllegalArgumentException("Element not found"));
        System.out.println("Second largest element of the Stream "+ secondSmallestElement);
    }

    private static void commonElementofArray(int[] x, int[] y) {
        //boxed to wrapper to int
        List<Integer> l=Arrays.stream(x).filter(number->Arrays.stream(y).anyMatch(arr2number->arr2number==number)).boxed().collect(Collectors.toList());
        System.out.println(l);
    }

    private static void reverseTheArray(int[] x) {
        IntStream.range(0,x.length/2).forEach(i->{
            int temp=x[i];
            x[i]=x[x.length-i -1];
            x[x.length-i-1]=temp;
        });

        System.out.println(Arrays.toString(x));
    }
}

class  Product{
    public String name;
    public int price;

    public String gender;

    public String dept;
    public Product(String name,int price,String gender,String dept){
        this.name=name;
        this.price=price;
        this.gender=gender;
        this.dept=dept;
    }

    public Product(){

    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public boolean yesOrNo(){
        return true;
    }
}

