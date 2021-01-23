class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(idx >= t.length()) return false;
            while(s.charAt(i) != t.charAt(idx)){
                idx++;
                if(idx >= t.length()) return false;
            }
            idx++;
        }
        return true;
    }
}
