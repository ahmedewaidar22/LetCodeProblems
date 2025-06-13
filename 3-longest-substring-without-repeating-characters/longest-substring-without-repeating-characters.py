class Solution(object):
    def lengthOfLongestSubstring(self, s):
        maxvalu=0
        l,r=0,0
        valu=set()
        for r in range(len(s)):
            while s[r] in valu:
                valu.remove(s[l])
                l+=1
            valu.add(s[r])
            maxvalu=max(maxvalu,len(valu))

        return maxvalu

        
