/*
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.isEmpty()) return true;
        for(String str: wordDict){
            if(s.startsWith(str)){
                String next = s.substring(str.length());
                if(wordBreak(next, wordDict)) return true;
            }
        }
        return false;
    }
}
*/

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        Arrays.fill(dp, false);
        dp[0] = true;
        var st = new HashSet<>(wordDict);
        
        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && st.contains(s.substring(j, i))) dp[i] = true;
            }
        }
        return dp[n];
    }
}
