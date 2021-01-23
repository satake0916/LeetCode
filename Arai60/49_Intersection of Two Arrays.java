class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) st.add(nums1[i]);
        Set<Integer> ans = new HashSet<>();
        for(int i = 0; i < nums2.length; i++)
            if(st.contains(nums2[i])) ans.add(nums2[i]);
        
        //return ans.stream().mapToInt(i->i).toArray();
        int[] ret = new int[ans.size()];
        int idx = 0;
        for(int i: ans) ret[idx++] = i;
        return ret;
    }
}
