class Solution {
public:

    bool isValid(vector<int>& arr, int n, int m, int maxAllowed) {
        int stu = 1;
        int pages = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] > maxAllowed) {
                return false;
            }

            if (pages + arr[i] <= maxAllowed) {
                pages += arr[i];
            } 
            else {
                stu++;
                pages = arr[i];
            }
        }

        return stu <= m;
    }

    int splitArray(vector<int>& arr, int k) {

        int n = arr.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int ans = -1;

        int st = *max_element(arr.begin(), arr.end());
        int end = sum;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (isValid(arr, n, k, mid)) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                st = mid + 1;
            }
        }

        return ans;
    }
};