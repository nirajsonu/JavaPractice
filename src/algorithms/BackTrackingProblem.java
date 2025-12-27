package algorithms;

// All explore all solutions.
// A general approach to backtracking questions in Java (Subsets, Permutations, Combination Sum,
// Palindrome, Partitioning
// make choice , Recurse ,undo choice(backtrack);
public class BackTrackingProblem {
    public static void main(String[] args) {
        generateSubsets();
    }

    private static void generateSubsets() {
        String set ="abc";
        int index =0;
       // getAllSubSetOfString(set,index,"");
        getAllCombinations(set,"");
    }

    private static void getAllCombinations(String str, String current) {
        if(str.length() == 0){
            System.out.println(current);
            return;
        }

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            String remaining = str.substring(0,i)+ str.substring(i+1);
            getAllCombinations(remaining,current+c);
        }
    }

    private static void getAllSubSetOfString(String str, int index, String current) {
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        // Exclude current character
        getAllSubSetOfString(str,index+1,current);
        // Include current character (fixed)
        getAllSubSetOfString(str,index+1,current +str.charAt(index));
    }
}
