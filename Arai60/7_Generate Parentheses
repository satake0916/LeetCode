/*
class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> st[] = new TreeSet[n+1];
        for(int i = 0; i <= n; i++) st[i] = new TreeSet<>();
        st[1].add("()");
        for(int i = 2; i <= n; i++){
            for(String s : st[i-1]){
                st[i].add("(" + s + ")");
            }
            
            for(int j = 1; j < i; j++){
                for(String s1 : st[j]){
                    for(String s2 : st[i-j]){
                        st[i].add(s1 + s2);
                    }
                }
            }
        }
        
        List<String> list = new LinkedList<>();
        for(String s: st[n]){
            list.add(s);
        }
        return list;
    }
}
*/

/*
class Solution{
    public List<String> generateParenthesis(int n){
        List<String> ans = new ArrayList();
        if(n == 0){
            ans.add("");
        }else{
            for(int c = 0; c < n; c++){
                for(String left: generateParenthesis(c)){
                    for(String right: generateParenthesis(n-1-c)){
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        return ans;
    }
}
*/

/*
class Solution{
    public List<String> generateParenthesis(int n){
        return solve(n, 0);
    }
    
    private List<String> solve(int n, int open){
        List<String> ret = new ArrayList<>();
        if(n == 0){
            String t = "";
            for(int i = 0; i < open; i++) t += ")";
            ret.add(t);
        }else if(open == 0){
            List<String> next = solve(n-1, 1);
            for(String s: next) ret.add("(" + s);
        }else{
            List<String> nextopen = solve(n-1, open+1);
            List<String> nextclose = solve(n, open-1);
            for(String s: nextopen) ret.add("(" + s);
            for(String s: nextclose) ret.add(")" + s);
        }
        return ret;
    }
}
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int n){
        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
        }

        if (open < n)
            backtrack(ans, cur+"(", open+1, close, n);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, n);
    }
}
