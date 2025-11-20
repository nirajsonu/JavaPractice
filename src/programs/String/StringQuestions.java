package programs.String;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringQuestions {
    public static void main(String[] args) {
        String vowelText = "IceCreAm";
        String text = "aabb";
        System.out.println(firstUniqChar(text));
        System.out.println(reverseVowels(vowelText));
        countFrequency();
        differentElement();
        stringIntern();
    }

    private static void reverseString(String name) {
        char[] charArray=name.toCharArray();
        int start=0;
        int end=charArray.length - 1;
        while (start<end){
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        System.out.println(new String(charArray));
    }

    private static String getValidWord(String[] wordList, String searchWord) {
        for (String candidate : wordList) {
            String temp = searchWord;
            boolean allMatch = true;

            for (int i = 0; i < candidate.length(); i++) {
                char c = candidate.charAt(i);
                int index = temp.indexOf(c);

                if (index != -1) {
                    // Remove that char from temp so it's not reused
                    temp = temp.substring(0, index) + temp.substring(index + 1);
                } else {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                return candidate;
            }
        }
        return "-";
    }

    private static void generatePermutationsOrderNotChanges(String name) {
        for(int i=0;i<name.length();i++){
            System.out.println(name.substring(i)+name.substring(0,i));
        }
    }

    private static void countvowelAndConstnanats(String name) {
        int countOFVowels=0;
        int countOfConsonants=0;
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if(c =='a' || c =='e' || c=='i' || c=='o' || c=='u'){
                countOFVowels++;
            }else{
                countOfConsonants++;
            }
        }
        System.out.println(" Vowels ->"+ countOFVowels);
        System.out.println(" Consonants ->" +countOfConsonants);
    }

    private static void wordCount(String word) {
        String words[]=word.split(" ");
        System.out.println(words.length);

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

    private static void generatePermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remainingString = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remainingString, permutation + currentChar);
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

    //toCharArray()
    private static void tocharArray() {
        String arr = "heelo how are you";
        char c[] = arr.toCharArray();
        System.out.print(c[1]);
        for (char charater : c) {
            //  System.out.print(charater);
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

    public static boolean getValidWordInArray() {
        String word[] = {"baby", "cat", "dada", "dog"};
        String searchWord = "dog";
        for (String w : word) {
            if (w.equals(searchWord)) {
                return true;
            }
        }
        return false;
    }

    private static void stringIntern() {
        String s="Neeraj";
        String s1="Neeraj";
        String s3=new String("Neeraj");
        String s4=s3.intern();
        System.out.println(s.equals(s1));
        System.out.println(s==s3);
        System.out.println(s==s4);
    }

    private static void countFrequency(){
        String test="Hello, World!";
        test = test.replaceAll("[^a-zA-Z]", "");
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char c:test.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }

    private static void differentElement() {
        // different element
        String s = "Neeraj";
        String s1 = "Neeraja";
        char c = 0;
        for (char cs : s.toCharArray()) c ^= cs;
        for (char cs : s1.toCharArray()) c ^= cs;
        System.out.println(c);

        // sub sequence
        String word1 = "abc";
        String word2 = "ahbgdc";
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            if (word1.charAt(i) == word2.charAt(j)) {
                i++;
            }
            j++;
        }
        System.out.println(i == word1.length());
    }

    private static void reverseStringLeetCode() {
        String reverse[] = {"h", "e", "l", "l", "o"};
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < reverse.length; i++) {
            stringBuffer.append(reverse[i]);
        }
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        String text = "IceCreAm";
        reverseVowels(text);
    }

    private static String reverseVowels(String text) {
        char[] chars = text.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (!isVowel(chars[start])) {
                start++;
                continue;
            }
            if (!isVowel(chars[end])) {
                end--;
                continue;
            }
            // swap vowels
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }



    // unique characters
    public static int firstUniqChar(String s) {
        int[] freq = new int[26]; // for lowercase letters
        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        // Find first unique
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
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
}
