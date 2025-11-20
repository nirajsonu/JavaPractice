import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practicc {
    public static void main(String[] args) throws Exception {

        String number ="3 4";
        String nu[] = number.split(" ");
        String firstNumber = nu[0];
        String secondNumber = nu[1];
        Double sum = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
        System.out.println(sum);


       i i = (a,b)->a+b;
       System.out.println(i.add(10,20));

       Runnable r = ()->{
          System.out.println("hello");
       };

       r.run();

        Callable c =()->{
           System.out.println("call");
           return "done";
        };

        c.call();


        // last word length in string
        String name = "Neeraj Kumar Keshri";
        String words[] = name.split( " ");
       // System.out.println(words[words.length-1].length());

        // chars will give unicode value of each chanter.
        name.chars().mapToObj(x->(char)x).filter(w->w =='a').collect(Collectors.toList());

        System.out.println(lengthOfLastWord(name));


        List<Integer> integerList = List.of(10,20,34,11,55,33);
        List<Integer> filterList = integerList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filterList);

        Integer max = integerList.stream().max(Integer::compareTo).get();
        Integer min = integerList.stream().min(Integer::compareTo).get();
        System.out.println("min -->" +min);
        System.out.println("max--->"+max);


        int a[] ={10,20,34,11,55,33};
        List<Integer> filterStream = Arrays.stream(a).boxed().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Arrays.stream(a).filter(x->x>0).forEach(System.out::println);
        Arrays.stream(a).min().getAsInt();
        Arrays.stream(a).average().orElse(0.0);
        System.out.println(filterStream);





        List<String> names = List.of("neeraj","sonu","rekha","seema");
        List<String> firstLetterUppercase = names.stream().
                map(n->n.substring(0,1).toUpperCase()+n.substring(1)).
                collect(Collectors.toList());
        System.out.println(firstLetterUppercase);

        List<String> result = names.stream()
                .map(x -> x.substring(0, x.length()-1) + x.substring(x.length()-1).toUpperCase())
                .collect(Collectors.toList());

        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect.entrySet());
        System.out.println(result);

        List<String> n = names.stream().filter(x -> x.startsWith("n")).collect(Collectors.toList());
        System.out.println(n);

        String word= "a1b2c3d4";
        Map<Boolean, String> collect1 = word.chars().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.groupingBy(x -> Character.isDigit(x.charAt(0)),
                Collectors.joining()));
        System.out.println(collect1.get(true) + collect1.get(false));

        String wo[] ={"Neeraj","Sonu","Seema"};
        Map<String, Integer> collect2 = Arrays.stream(wo).collect(Collectors.toMap(Function.identity(), String::length, (x, b) -> x));
        System.out.println(collect2);


        Map<String, List<Integer>> collect3 = Arrays.stream(wo).collect(Collectors.groupingBy(Function.identity(), Collectors.mapping(String::length, Collectors.toList())));
        System.out.println(collect3);

        List<Integer> list = List.of(20,10,30,24,20,10);
        List<Integer> collect4 = list.stream().distinct().collect(Collectors.toList());
        Integer collect5 = list.stream().mapToInt(Integer::intValue).sum();
        list.stream().filter(x->x>10).collect(Collectors.toList());
        System.out.println(collect5);
        Integer i1 = list.stream().sorted().skip(1).findFirst().get();
        System.out.println("find"+i1);


        // remove null value in stream api
        List<String> stringList = Arrays.asList("Apple","Banana","Kiwi", null, null);
        System.out.println(stringList.stream().filter(s-> s != null).collect(Collectors.toList()));

        List<String> collect6 = stringList.stream().filter(Objects::nonNull).collect(Collectors.toList());

        String first = stringList.stream().findFirst().get();
        System.out.println(collect6);

        int arr[]= {2,4,5,6,8};
        // boxed used in only int,double,long   // rest map to obj
        Arrays.stream(arr).boxed().collect(Collectors.toList()).forEach(System.out::println);

        List<String> s = List.of("apple","kiwi","banana","pineapple");
        List<String> collect7 = s.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        s.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(collect7);

        boolean a1 = s.stream().anyMatch(x -> x.startsWith("a"));
        s.stream().noneMatch(x->x.startsWith("z"));
        s.stream().allMatch(x->x.startsWith("a"));


        int reduce = Arrays.stream(arr).reduce(1, (x, y) -> x + y);
        System.out.println(reduce);

        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> map = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map.entrySet());

        List<String> namesList = Arrays.asList("John", "Jane", "John", "Alex", "Jane");
        namesList.stream().collect(Collectors.toSet()).forEach(System.out::println);

        String fruitsArray[]={"apple", "banana", "pineapple", "apple", "orange", "orange"};
        LinkedHashMap<String, Long> fruitsMap = Arrays.stream(fruitsArray).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(fruitsMap);
    }

    public static int lengthOfLastWord(String s) {
        int len=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }
            else{
                break;
            }
        }
        return len;
    }


}




@FunctionalInterface
interface i{
    int add(int a,int b);
}