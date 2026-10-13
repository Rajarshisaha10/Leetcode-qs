
class Solution {
    public int solve(int ans) {
        long temp = 0;

        while (ans > 0) {
            int z = ans % 10;
            temp = temp * 10 + z;
            ans = ans / 10;
        }

        if (temp > Integer.MAX_VALUE) return 0;
        return (int) temp;
    }

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;

        if (x < 0) {
            int y = Math.abs(x);
            return -solve(y);
        } else {
            return solve(x);
        }
    }
}
