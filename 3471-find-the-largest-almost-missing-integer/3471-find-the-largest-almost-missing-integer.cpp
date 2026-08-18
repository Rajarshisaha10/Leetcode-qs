class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {

        int n = nums.size();
        if (k == 1) {

            unordered_map<int, int> freq;

            for (int x : nums) {
                freq[x]++;
            }

            int ans = -1;

            for (auto [x, count] : freq) {
                if (count == 1) {
                    ans = max(ans, x);
                }
            }

            return ans;
        }

        // Case 2: k == n
        if (k == n) {
            return *max_element(nums.begin(), nums.end());
        }

        // Case 3: 1 < k < n

        int ans = -1;

        // Check first element
        bool uniqueFirst = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[0]) {
                uniqueFirst = false;
                break;
            }
        }

        if (uniqueFirst) {
            ans = max(ans, nums[0]);
        }

        // Check last element
        bool uniqueLast = true;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[n - 1]) {
                uniqueLast = false;
                break;
            }
        }

        if (uniqueLast) {
            ans = max(ans, nums[n - 1]);
        }

        return ans;
    }
};