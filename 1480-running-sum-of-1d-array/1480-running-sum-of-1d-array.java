class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] newarr = new int[n];
        for(int i = 0;i < n; i++){
            sum = sum + nums[i];
            newarr[i] = sum;
        }
        return newarr;
    }
}