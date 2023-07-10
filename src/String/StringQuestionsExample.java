package String;

import java.util.Scanner;
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
        CountFrequency();
        CountVowelAndConsonant();
    }

    private static void CountVowelAndConsonant() {
        String name="Neeraj";
        int vowel=0;
        int cons=0;

        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(c=='a' || c=='e' || c == 'o' || c == 'i' || c=='u'){
                vowel=vowel+1;
            }
            else{
                cons=cons+1;
            }
        }
        System.out.println("volwel is "+vowel);
        System.out.println("cons is " +cons);
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
}


