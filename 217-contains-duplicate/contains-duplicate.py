class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dic=set()
        for num in nums:
            if num in dic:
                return True
            dic.add(num)
        return False



        