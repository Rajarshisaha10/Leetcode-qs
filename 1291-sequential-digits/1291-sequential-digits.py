class Solution(object):
    def sequentialDigits(self, low, high):
        """
        :type low: int
        :type high: int
        :rtype: List[int]
        """
        s = "123456789"

        ans = []
        for i in range(2,10):
            for j in range(0,10-i):
                num = int(s[j:j+i])
                if num >= low and num <= high:
                    ans.append(num)
        return ans
        