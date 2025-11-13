package javaversions.java14;

public class Java14Features {
    public static void main(String[] args) {
       Author author = new Author("Neeraj",12);
        System.out.println(author);
    }
}


record Author(String name,int age){}
