public class Solution {

    // Function to check if 'word' can be formed from 'st'
    private static boolean isSubsequence(String st, String word) {
        int n = st.length();
        int m = word.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (st.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == m;
    }

    public static String longestMatchingWord(int n, int x, String st, ArrayList<String> words) {
        String longestWord = "#";

        for (String word : words) {
            if (isSubsequence(st, word)) {
                if (word.length() > longestWord.length() || 
                    (word.length() == longestWord.length() && word.compareTo(longestWord) < 0)) {
                    longestWord = word;
                }
            }
        }

        return longestWord;
    }}
