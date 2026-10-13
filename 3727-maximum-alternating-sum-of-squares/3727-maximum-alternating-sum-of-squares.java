import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i=0;i<n;i++){
            if (nums[i] < 0){
                nums[i] = Math.abs(nums[i]);
            }
        }
        Arrays.sort(nums);

        
        int n1 = n / 2;

        int[] smval = Arrays.copyOfRange(nums, 0, n1);
        int[] bigval = Arrays.copyOfRange(nums, n1, n);

        long sum = 0;

        for (int i = 0; i < smval.length; i++) {
            sum -= (long) smval[i] * smval[i];
        }
        for (int i = 0; i < bigval.length; i++) {
            sum += (long) bigval[i] * bigval[i];
        }
        return sum;
    }
}