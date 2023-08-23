class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
Set<Integer> s = new HashSet<>();
for (int v : nums) {
    s.add(v);
}    
 int x=0;
     int longest=0;
     if(nums.length==0){
         return 0;
     }else if(nums.length==1){
         return 1;
     }
int priv = Collections.min(s);
 System.out.println(priv);

     for (Integer i : s) {
         

if(!s.contains(i-1)){ // start of a sequence
                int count =1;
                while(s.contains(i + 1)){ // check if hs contains next no.
                    i++;
                    count++;
                }
                longest = Math.max(longest, count);
                
           }
          
     }  
     return longest;
    }
}