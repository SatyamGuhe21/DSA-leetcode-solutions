class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder words = new StringBuilder();

        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                words.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                words.append(word2.charAt(i));
            }

            i++;
        }

        return words.toString();
    }
}