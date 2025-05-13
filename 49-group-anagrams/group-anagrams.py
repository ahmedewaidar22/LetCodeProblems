class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res=defaultdict(list)
        for s in strs:
            a=[0]*26
            for c in s:
                a[ord(c)-ord('a')]+=1
            key =tuple(a)
            res[key].append(s)
        return list(res.values())
        