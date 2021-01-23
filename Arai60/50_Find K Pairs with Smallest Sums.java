class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> q = new PriorityQueue<>(
            (a, b) -> (a.get(0) + a.get(1)) - (b.get(0) + b.get(1))
        );
        
        for(int i1: nums1){
            for(int i2: nums2){
                q.offer(List.of(i1, i2));
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < k && (!q.isEmpty()); i++) ans.add(q.poll());
        return ans;
    }
}
