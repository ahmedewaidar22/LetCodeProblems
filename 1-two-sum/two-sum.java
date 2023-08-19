class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> prevMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int x = nums[i];
        int targ = target-x;
        if(prevMap.containsKey(targ)){
            System.gc();
        return new int[] { prevMap.get(targ), i };

        }
            prevMap.put(x, i);

    }
        return new int[] {};
    }
}