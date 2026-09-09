class Solution {
    public boolean uniformArray(int[] nums1) {
        if (nums1 == null || nums1.length == 0) {
            return true;
        }

        int min = nums1[0];
        boolean hasOdd = false;

        for (int num : nums1) {
            min = Math.min(min, num);
            if (Math.abs(num % 2) == 1) {
                hasOdd = true;
            }
        }
        return !(min % 2 == 0 && hasOdd);
    }
}