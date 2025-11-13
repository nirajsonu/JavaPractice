package datastuctures.string;


public class StringExample {
    public static void main(String[] args) {
        String name = "abc";
        String unSortedString="cbe";
      //  generatePermutations(name, "");
      //  generatePermutationsOrderNotChanges(name);
        //sortString(unSortedString);
       // countvowelAndConstnanats(name);
        //anagramOfString(name,unSortedString);
        reverseString(name);
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

    private static void anagramOfString(String name,String unSortedString) {

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

    private static void sortString(String unSortedString) {
        for(int i=0;i<unSortedString.length();i++){
            int start=0;

        }
    }

    private static void generatePermutationsOrderNotChanges(String name) {
        for(int i=0;i<name.length();i++){
            System.out.println(name.substring(i)+name.substring(0,i));
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


}
