class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] word = s.split(" ");

        if(pattern.length() != word.length){
            return false;
        }

        String[] map = new String[26];

        for(int i = 0; i < pattern.length(); i++ ){
            char ch = pattern.charAt(i);
            
            int index = ch - 'a';

            if(map[index] != null){
                if(!map[index].equals(word[i])){
                    return false;
                }
            }
            else{
                
                for(int j = 0; j < 26 ; j++){
                    if(word[i].equals(map[j])){
                        return false;
                    }
                }
                map[index] =word[i];
            }
        }

        return true;
    }
}