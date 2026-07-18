class Solution {
public:
    int findGCD(vector<int>& nums) {
        auto [min,max] = minmax_element(nums.begin(),nums.end());
        return gcd(*min,*max);
    }
};