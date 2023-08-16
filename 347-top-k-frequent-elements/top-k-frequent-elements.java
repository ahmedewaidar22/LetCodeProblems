class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    HashMap<Integer, Integer> freqq = new HashMap<>();

        for (int i =0;i<nums.length;i++){
            if(freqq.containsKey(nums[i])){
              freqq.put(nums[i],freqq.get(nums[i]) +1);
            }else{
             freqq.put(nums[i] , 1);
            }
        }
   

       PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> freqq.get(b) - freqq.get(a));
        for (int num : freqq.keySet()) {
            heap.offer(num);
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
      return result;
    }
}