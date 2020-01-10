class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = "";
        if(strs.length == 0) return ret;
        int n = strs[0].length();
        for(int i = 1; i < strs.length; i++) n = Math.min(n, strs[i].length());
        for(int i = 0; i < n; i++){
            char now = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(now != strs[j].charAt(i)){
                    return ret;
                }
            }
            ret += now;
        }
        return ret;
    }
}
