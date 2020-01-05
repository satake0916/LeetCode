class Solution {
    public boolean isValid(String s) {
        Stack<Integer> q = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    q.push(0);
                    break;
                case '{':
                    q.push(1);
                    break;
                case '[':
                    q.push(2);
                    break;
                case ')':
                    if(q.empty() || q.pop() != 0) return false;
                    break;
                case '}':
                    if(q.empty() || q.pop() != 1) return false;
                    break;
                case ']':
                    if(q.empty() || q.pop() != 2) return false;
                    break;
                default:
                    return false;
            }
        }
        if(!q.empty()) return false;
        return true;
    }
}
