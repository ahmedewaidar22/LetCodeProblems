class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        frequent={}
        for num in nums:
            if num in frequent:
                frequent[num]+=1
            else:
                frequent[num]=1
        sorted_values=[key for key, _ in(sorted(frequent.items(), key=lambda item: item[1], reverse=True))]
        return(sorted_values[:k])
        # print(sorted_values[:2].keys()) 
        