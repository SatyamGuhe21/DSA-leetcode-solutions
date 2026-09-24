class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;

        while (j < typed.length()) {

            // Normal matching
            if (i < name.length() &&
                name.charAt(i) == typed.charAt(j)) {

                i++;
                j++;

            // Long pressed character
            } else if (j > 0 &&
                       typed.charAt(j) == typed.charAt(j - 1)) {

                j++;

            } else {
                return false;
            }
        }

        return i == name.length();
    }
}