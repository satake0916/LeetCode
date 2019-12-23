class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        if(n == 0) return true;
        
        int start = 0, end = n-1;
        while(start < end){
            char a = s.charAt(start), b = s.charAt(end);
            if(!Character.isLetterOrDigit(a)){
                start++;
            }else if(!Character.isLetterOrDigit(b)){
                end--;
            }else{
                if(a != b) return false;
                else{
                    start++;
                    end--;
                }
            }
        }
        return true;
    }
}
