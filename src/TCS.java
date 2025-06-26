import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TCS {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Neeraj","A101",99.0, 'M',true));
        studentList.add(new Student("Sonu","A102",80.0,'F',false));
        studentList.add(new Student("Reema","A103",70.0,'F',false));
        studentList.add(new Student("Seema","A201",60.0,'M',true));

        //studentList.stream().forEach(System.out::println);
        //studentList.forEach(System.out::println);

        // calculate male and female count
        Map<Character, Long> collect = studentList.stream().map(Student::getGender).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<Character,Long> map:collect.entrySet()){
            System.out.print(map.getKey() + "-->");
            System.out.println(map.getValue());
        }

        // calculate avg marks
        double asDouble = studentList.stream().mapToDouble(Student::getMarks).average().getAsDouble();
        System.out.println("Average marks is " +asDouble);


        //Name start with N and marks greater than equal to 70
        studentList.stream().filter(s->s.getName().startsWith("N") && s.getMarks() >=70 ).collect(Collectors.toList()).forEach(System.out::println);

        //sort name as ascending order
       // studentList.stream().map(s->s.getName()).sorted().collect(Collectors.toList()).forEach(System.out::println);

        //sort name as descending order
        studentList.stream().map(s->s.getName()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //sort salary
       // studentList.stream().map(s->s.getMarks()).sorted().forEach(System.out::println);


      //  studentList.stream().map(s->s.getMarks()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Highest marks
        Optional<Double> highest = studentList.stream().map(s -> s.getMarks()).sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("Highest marks " +highest.get());

        //lowest marks
        Optional<Double> smallest = studentList.stream().map(s -> s.getMarks()).sorted().findFirst();
        System.out.println("Smallest marks " +smallest.get());


        // 2nd highest marks
        Double secondSmallestMarks = studentList.stream().map(s -> s.getMarks()).sorted().skip(1).findFirst().get();
        System.out.println("Second smallest Marks "+secondSmallestMarks);


        //Summarize Statics
        DoubleSummaryStatistics stats = studentList.stream().map(s -> s.getMarks()).collect(Collectors.summarizingDouble(Double::doubleValue));
        System.out.println("Max " + stats.getMax());
        System.out.println("Average "+stats.getAverage());
        System.out.println("Count "+stats.getCount());
        System.out.println("Sum "+stats.getSum());
        System.out.println("Min "+stats.getMin());


        // partition by
        studentList.stream().collect(Collectors.partitioningBy(s->s.getMarks() < 80)).get(true).forEach(System.out::println);
        studentList.stream().collect(Collectors.partitioningBy(s->s.getMarks() < 80)).get(false).forEach(System.out::println);

        studentList.parallelStream().map(s->{
            char gender = (s.getGender()=='m') ? 'f':'m';
            return new Student(s.getName(),s.getRollNo(),s.getMarks(),gender,s.isScholar());
        }).collect(Collectors.toList()).forEach(System.out::println);





    }
}

class Student{
    private String name;
    private String rollNo;
    private Double marks;
    private char gender;
    private boolean isScholar;

   Student(String name,String rollNo,Double marks,char gender,boolean isScholar){
       this.name=name;
       this.rollNo=rollNo;
       this.marks=marks;
       this.gender=gender;
       this.isScholar=isScholar;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isScholar() {
        return isScholar;
    }

    public void setScholar(boolean scholar) {
        isScholar = scholar;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", marks=" + marks +
                ", gender=" + gender +
                ", isScholar=" + isScholar +
                '}';
    }
}