/*
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }else{
                mp.put(nums[i], 1);
            }
        }
        
        var result = new ArrayList<Integer>();
        for(int i: mp.values()){
            result.add(i);
        }
        Collections.sort(result);

        int the = result.get(result.size()-k);
        var ans = new int[k];
        int index = 0;
        for(var item: mp.entrySet()){
            if(item.getValue() >= the){
                ans[index] = item.getKey();
                index++;
            }
        }
        
        return ans;
    }
}
*/

/*
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: nums) mp.put(num, mp.getOrDefault(num, 0) + 1);
        
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> mp.get(n1) - mp.get(n2)
        );
        
        for(int key: mp.keySet()){
            heap.add(key);
            if(heap.size() > k) heap.poll();
        }
        
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) ans[i] = heap.poll();
        
        return ans;
    }
}
*/

class Solution {
    int[] unique;
    Map<Integer, Integer> count;
    
    public int[] topKFrequent(int[] nums, int k) {
        count = new HashMap<>();
        for(int num: nums) count.put(num, count.getOrDefault(num, 0) + 1);
        
        int n = count.size();
        unique = new int[n];
        int index = 0;
        for(int num: count.keySet()){
            unique[index] = num;
            index++;
        }
        
        quickselect(0, n-1, n-k);
        return Arrays.copyOfRange(unique, n-k, n);
    }
    
    public void quickselect(int left, int right, int k_smallest){
        if(left == right) return;
        
        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right-left);
        
        pivot_index = partition(left, right, pivot_index);
        
        if(k_smallest == pivot_index) return;
        else if(k_smallest < pivot_index) quickselect(left, pivot_index, k_smallest);
        else quickselect(pivot_index+1, right, k_smallest);
    }
    
    public int partition(int left, int right, int pivot_index){
        int pivot_frequency = count.get(unique[pivot_index]);
        swap(pivot_index, right);
        int store_index = left;
        
        for(int i = left; i < right; i++){
            if(count.get(unique[i]) < pivot_frequency){
                swap(store_index, i);
                store_index++;
            }
        }
        
        swap(store_index, right);
        return store_index;
    }
    
    public void swap(int a, int b){
        int t = unique[a];
        unique[a] = unique[b];
        unique[b] = t;
    }
}
