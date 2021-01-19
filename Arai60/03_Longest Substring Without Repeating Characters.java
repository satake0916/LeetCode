/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int curr = 0;
        int start = -1;
        int end = -1;
        Set<Character> st = new HashSet<>();
        while(start < n-1){            
            if(end < n-1 && !st.contains(s.charAt(end+1))){
                end++;
                curr++;
                st.add(s.charAt(end));
                ans = Math.max(ans, curr);
            }else{
                curr--;
                start++;
                st.remove(s.charAt(start));
            }
        }
        return ans;
    }
}
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> mp = new HashMap<>();
        //endを含めたときにstartをどこまで動かせるか(startは含む)
        for(int start = 0, end = 0; end < n; end++){
            if(mp.containsKey(s.charAt(end))){
                start = Math.max(mp.get(s.charAt(end)), start);
            }
            ans = Math.max(ans, end-start+1);
            mp.put(s.charAt(end), end+1);
        }
        return ans;
    }
}
