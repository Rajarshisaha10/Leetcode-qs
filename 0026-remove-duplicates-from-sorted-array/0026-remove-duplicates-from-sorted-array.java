
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int unique = nums[0];
        int k = 1;

        for (int i = 1; i < n; i++) {
            if (unique != nums[i]) {
                unique = nums[i];
                nums[k] = unique;
                k++;
            }
        }

        return k;
    }
}
