package String;

import java.util.ArrayList;
import java.util.List;

public class StringQuestionsExample {
    public static void main(String args[]) {
        //   Scanner scanner=new Scanner(System.in);
        //  System.out.println("Enter the 1st String to reverse");
      /*  String text=scanner.nextLine();
        System.out.println("Enter the 2nd String");*/
        //String text1=scanner.nextLine();
        //  System.out.println("Reverse of the String--->"+reverseEachLetter(text));
        //  System.out.println("IsPalindrome--->"+PalindromicString(text,text1));
        // System.out.println(capitaliseEachLetter(text));

        //    tocharArray();
        //  System.out.println(reverseEachLetter("hi neeraj"));
      //  System.out.println(capitaliseEachLetter("this is example of capital"))
       // CountFrequency();
      //  CountVowelAndConsonant();

        String word="my";
       // System.out.println(word.length());
      //  System.out.println(reverseEachLetter("my name is neeraj prince"));
       // reverseWords("Prince Choudhary");
     //   wordCount(word);

      //  String cookieName="My name is neeraj";
      //  replaceSpaceToUnderScore(cookieName);

        getSmallerQuantityProduct();

    }

    private static void reverseWords(String princeChoudhary) {
        String wordArray[]=princeChoudhary.split(" ");

        for(String s:wordArray){
            char[] charArray = s.toCharArray();
            for(int i=charArray.length-1;i>=0;i--){
                System.out.print(charArray[i]);
            }
            System.out.println(" ");
        }
    }


    private static void replaceSpaceToUnderScore(String cookieName) {
        String spitted[]=cookieName.split(" ");
        StringBuffer sb=new StringBuffer();
        for(String s:spitted){
            sb.append(s+'_');
        }
        System.out.println(sb);
    }

    private static void wordCount(String word) {
        String words[]=word.split(" ");
        System.out.println(words.length);

    }

    //toCharArray()
    private static void tocharArray() {
        String arr = "heelo how are you";
        char c[] = arr.toCharArray();
        System.out.print(c[1]);
        for (char charater : c) {
            //  System.out.print(charater);
        }
    }


    //chatAt()
    private static String reverseEachLetter(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result = text.charAt(i) + result;
        }
        return result;
    }


    //palindromic
    private static Boolean PalindromicString(String text, String secondString) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result = text.charAt(i) + result;
        }
        if (result.equals(secondString)) {
            return true;
        } else {
            return false;
        }
    }

    //capital
    private static String capitaliseEachLetter(String text) {
        String result[] = text.split(" ");
        for (int i = 0; i < text.length() - 1; i++) {
            char c = result[i].charAt(0);
            String c1 = String.valueOf(c).toUpperCase();
            System.out.println(c1);
        }

        return "";
    }


    private static void CountFrequency() {
        String a = "this is a car";
        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < a.length() - 1; i++) {
                if(c==a.charAt(i)){
                    count++;
                }
                if(count!=0){

                }
            }
            System.out.println(c +"--->"+ count);
        }
    }

    private static void getSmallerQuantityProduct(){
        String s = "pen100;copy50;key30";
        List<Character> list = new ArrayList<>();

        // Split the input string by semicolon
        String[] splited = s.split(";");

        // Iterate through each product (like "pen100", "copy50", "key30")
        for (String product : splited) {
            // Iterate over each character of the product
            for (int i = 0; i < product.length(); i++) {
                char ch = product.charAt(i);

                // If the character is a digit, add it to the list
                if (Character.isDigit(ch)) {
                    list.add(ch);
                }
            }
        }

        // Print the list of digits (characters)
        System.out.println(list);
    }


}


