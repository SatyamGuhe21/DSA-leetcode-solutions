class Solution {
    public boolean checkIfPangram(String sentence) {
        

        boolean[] alphabet = new boolean[26];

        for(int i = 0 ; i <sentence.length();i++)
        {
            char c = sentence.charAt(i);

            int index = c - 'a';
            alphabet[index] = true ;
        }

        for(int i = 0; i < 26; i++){
            if(alphabet[i] == false){
                return false;
            }
        }
        return true;
    }
}