package programs.String;

public class StringQuestion {
    public static void main(String[] args) {
        String word[] = {"baby", "cat", "dada", "dog"};
        System.out.println(getValidWordInArray(word,"neeraj"));
    }


    public static boolean getValidWordInArray(String[] words, String searchWord) {
        for (String w : words) {
            if (w.equals(searchWord)) {
                return true;
            }
        }
        return false;
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

