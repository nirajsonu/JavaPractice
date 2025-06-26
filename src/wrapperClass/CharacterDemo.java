package wrapperClass;

public class CharacterDemo {
    public static void main(String[] args) {
        char c='c';
        //unboxing the values..
        System.out.println(c);

       System.out.println(Character.isDigit(c));
       System.out.println(Character.isAlphabetic(c));
       System.out.println(Character.toUpperCase(c));
       System.out.println(Character.isLetter(c));
    }
}
