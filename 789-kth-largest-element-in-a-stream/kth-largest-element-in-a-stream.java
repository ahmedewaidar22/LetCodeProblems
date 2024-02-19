class KthLargest {
    final PriorityQueue<Integer> heap = new PriorityQueue<>();
        final int k;
    public KthLargest(int k, int[] nums) {
    this.k=k;
    for (int n : nums) add(n);
    }
    
    public int add(int val) {
        if(heap.size()<k){heap.add(val);}
        else if(heap.peek()<val){
            heap.poll();
             heap.add(val);
             System.out.println(heap.peek()+"enter"+heap.size());
        }   
        return heap.peek() ;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */