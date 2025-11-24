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
        getAllSubSetOfString(set,index,"");
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
