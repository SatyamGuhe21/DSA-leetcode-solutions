class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int index1 = 0;
        int index2 = 0;

        // First number goes to arr1
        arr1[index1++] = nums[0];

        // Second number goes to arr2
        arr2[index2++] = nums[1];

        // Process remaining numbers
        for (int i = 2; i < n; i++) {

            if (arr1[index1 - 1] > arr2[index2 - 1]) {
                arr1[index1++] = nums[i];
            } else {
                arr2[index2++] = nums[i];
            }
        }

        // Combine arr1 and arr2
        int[] result = new int[n];

        int k = 0;

        for (int i = 0; i < index1; i++) {
            result[k++] = arr1[i];
        }

        for (int i = 0; i < index2; i++) {
            result[k++] = arr2[i];
        }

        return result;
    }
}