class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i;
        int j;

        for( i = 0; i< nums.length; i++ ){
                int a = nums[i];
            for( j = i+1; j< nums.length; j++){

                    int b= nums[j];

                    int c= a+b;

                    if(target == c){
                     return new int[]{i, j};
                    }
            }
        }
         return new int[]{};
    }
}