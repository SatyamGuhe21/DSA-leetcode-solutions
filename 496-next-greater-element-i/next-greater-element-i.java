
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] answer = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int element = nums1[i];
            int index = -1;

            // Find the element in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == element) {
                    index = j;
                    break;
                }
            }

            answer[i] = -1;

            // Find the next greater element
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > element) {
                    answer[i] = nums2[j];
                    break;
                }
            }
        }

        return answer;
    }
}
