import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceTotal = 0;
        int bobTotal = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            aliceTotal += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            bobTotal += bobSizes[i];
        }

        int difference = (bobTotal - aliceTotal) / 2;

        Arrays.sort(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {

            int required = aliceSizes[i] + difference;

            if (binarySearch(bobSizes, required)) {
                return new int[]{aliceSizes[i], required};
            }
        }

        return new int[]{};
    }

    public boolean binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return false;
    }
}