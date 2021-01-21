/*
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char t = s.charAt(i);
            if(t == '(' || t == '[' || t == '{'){
                stack.addLast(t);
                continue;
            }
            if(stack.size() == 0) return false;
            if(t == ')'){
                if(stack.pollLast() == '(') continue;
            }
            if(t == ']'){
                if(stack.pollLast() == '[') continue;
            }
            if(t == '}'){
                if(stack.pollLast() == '{') continue;
            }
            return false;
        }
        
        return stack.size() == 0;
    }
}
*/

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++){
            char t = s.charAt(i);
            if(firstChar(t)){
                stack.addLast(t);
                continue;
            }
            if(stack.size() == 0) return false;
            if(match(stack.pollLast(), t)) continue;
            return false;
        }
        
        return stack.size() == 0;
    }
    
    private boolean firstChar(Character a){
        return (a == '(' || a == '[' || a == '{');
    }
    
    private boolean match(Character a, Character b){
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }
}
