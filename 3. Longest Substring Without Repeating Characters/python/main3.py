class Solution:
    def lengthOfLongestSubstring(self, s):
        n = 0
        ans = 0
        m = {}
        n = len(s)
        i = 0
        j = 0
        while j < n:
            if s[j] in m:
                i = max(i, m.get(s[j]))
            ans = max(ans, j - i + 1)
            m[s[j]] = j + 1
            j += 1
        return ans

sol=Solution()
print(sol.lengthOfLongestSubstring("abcdcca"))