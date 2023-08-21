class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int j=height.length-1;
        int i=0;
        while(i!=j){
            
            int area=(j-i)*Math.min(height[i],height[j]);
                max=Math.max(max,area);
            if(height[j]<height[i]){
                j--; 
            }else{
                 i++;
            }        
        }
        return max;
    }
}