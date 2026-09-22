class Solution {
    public int[] sumZero(int n) {
        
        int[] answer = new int[n];
        int index =0;

        for (int i= 1; i<=n/2; i++){
            answer[index] = i;
            index++;
             answer[index] = -i;
            index++;
        }
        if(n%2!=0){
            answer[index]=0;
        }
        return answer;
    }
}