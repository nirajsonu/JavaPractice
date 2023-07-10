package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Examples {
    public static void main(String a[]){
        List<Product> productList= new ArrayList<Product>();
        productList.add(new Product("Neeraj",100));
        productList.add(new Product("Sonu",101));
        productList.add(new Product("Ram",99));
        productList.add(new Product("Neeraj",100));

        String fruits[]={"Apple","Banana","Papya"};


        productList.stream().filter(p->p.price==101).map(p->p.price=201).collect(Collectors.toList()).forEach(System.out::println);

       //groupby
        Map<String,Long>  result =  Arrays.stream(fruits).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);


        Map<String,Long> result1=productList.stream().collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
        System.out.println(result1);

        //average
        Map<String,Double> result2=productList.stream().collect(Collectors.groupingBy(Product::getName,Collectors.averagingInt(Product::getPrice)));
        System.out.println(result2);

        //countSum


        //distict
        productList.stream().map(Product::getPrice).distinct().forEach(System.out::println);



        //Traditional method..
        for(Product p:productList){
            //System.out.println(Integer.parseInt(p.getPrice()) +10);
        }

        List<String> strings=new ArrayList<>();
        strings.add("hello");
        strings.add("world");

        //Using Java 8
        System.out.println("---------------------------------");
        System.out.println("Using java 8");
        System.out.println("---------------------------------");
        productList.stream().filter(p->p.name.startsWith("S")).map(p->p.name).collect(Collectors.toList()).forEach(System.out::println);
        productList.stream().map(p->p.price +100).collect(Collectors.toList()).forEach(System.out::println);

        //limit,skip
       List<Product> l= productList.stream().sorted((o1,o2)->(int)o1.price -o2.price).limit(2).collect(Collectors.toList());
       System.out.println(l);

       //using comparing
        Collections.sort(productList, Comparator.comparing(e -> e.price));
        System.out.println(productList);


        //Filter
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<6;i++){
            list.add(i);
        }
        List<Integer> list2=list.stream().filter(x->x%2==0).collect(Collectors.toList());
      //  System.out.print(list2);

        //map

    }
}

class Product{
    public String name;
    public int price;
    public Product(String name,int price){
        this.name=name;
        this.price=price;
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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
