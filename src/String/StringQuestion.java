package String;

import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
        String word[] = {"baby", "cat", "dada", "dog"};
        Scanner sccaner = new Scanner(System.in);
       // String searchWord = sccaner.next();
        String searchWord = "cat";
        for(int i=0;i<searchWord.length()-1;i++){
            char c = searchWord.charAt(i);
            int i1 = c - 'a';  // index 
            System.out.println(i1);
        }


      //  System.out.println(getValidWord(word,searchWord));
        searchWord.length();
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

}

