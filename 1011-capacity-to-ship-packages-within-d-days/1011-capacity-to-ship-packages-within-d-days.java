class Solution {

    public boolean canFit(int[] weights, int cap, int days) {

        int curr_wei = 0;
        int day = 1;

        for (int i = 0; i < weights.length; i++) {

            if (curr_wei + weights[i] > cap) {
                day++;
                curr_wei = 0;
            }

            curr_wei += weights[i];
        }

        return day <= days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int min = 0;

        for (int weight : weights) {
            max += weight;
            min = Math.max(min, weight);
        }

        while (max >= min) {

            int mid = min + (max - min) / 2;

            if (canFit(weights, mid, days)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }
}