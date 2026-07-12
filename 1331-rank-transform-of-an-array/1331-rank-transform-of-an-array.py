class Solution(object):
    def arrayRankTransform(self, a):
        """
        :type a: List[int]
        :rtype: List[int]
        """

        b = a[:]
        b.sort()

        m = {}
        r = 1

        for x in b:
            if x not in m:
                m[x] = r
                r += 1

        for i in range(len(a)):
            a[i] = m[a[i]]

        return a