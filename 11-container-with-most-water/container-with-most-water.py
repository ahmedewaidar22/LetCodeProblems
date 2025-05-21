class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxval=0
        l,r=0,len(height)-1
        while l<r:
            high=min(height[l],height[r])
            value= high *(r-l)
            maxval=max(maxval,value)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return(maxval)
