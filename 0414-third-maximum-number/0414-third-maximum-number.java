class Solution {
    public int thirdMax(int[] nums) {
        // Deque<Integer> pq=new ArrayDeque<>(3);
        TreeSet<Integer> pq=new TreeSet<>();
        for(int x:nums){
            pq.add(x);
            if(pq.size()>3)
                pq.pollFirst();
        }
        // pq.pollLast();?
        // pq.pollLast();
        return pq.size()==3?pq.pollFirst():pq.pollLast();
        
    }
}