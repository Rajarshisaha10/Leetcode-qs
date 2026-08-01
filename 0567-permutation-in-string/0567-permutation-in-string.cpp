class Solution {
public:
    bool isFreq(const int freq[], const int winfreq[]) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != winfreq[i]) {
                return false;
            }
        }
        return true;
    }

    bool checkInclusion(string s1, string s2) {
        int freq[26] = {0};

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1[i] - 'a']++;
        }

        int windowsize = s1.length();

        // Check every possible window
        for (int i = 0; i < s2.length(); i++) {
            int winIdx = 0;
            int idx = i;
            int winfreq[26] = {0};

            while (winIdx < windowsize && idx < s2.length()) {
                winfreq[s2[idx] - 'a']++;
                winIdx++;
                idx++;
            }

            if (isFreq(freq, winfreq)) {
                return true;
            }
        }

        return false;
    }
};