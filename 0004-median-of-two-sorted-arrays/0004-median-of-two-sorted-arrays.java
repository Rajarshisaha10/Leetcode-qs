
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int i1 = 0, i2 = 0;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                nums[i] = nums2[i2++];
            } else if (i2 == n2) {
                nums[i] = nums1[i1++];
            } else if (nums1[i1] <= nums2[i2]) {
                nums[i] = nums1[i1++];
            } else {
                nums[i] = nums2[i2++];
            }
        }

        if (n % 2 == 0) {
            return ((double) nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        } else {
            return nums[n / 2];
        }
    }
}
