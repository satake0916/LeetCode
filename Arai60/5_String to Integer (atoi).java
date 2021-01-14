/*
class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        
        boolean positive = true;
        boolean notwhite = true;
        boolean numex = false;
        int numsign = 0;
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                if(!notwhite) return (positive ? ans : -1 * ans);
                continue;
            }
            
            notwhite = false;
            
            if(s.charAt(i) == '-'){
                if(numex) return (positive ? ans : -1 * ans);
                numsign++;
                if(numsign >= 2) return 0;
                positive = !positive;
                continue;
            }
            if(s.charAt(i) == '+'){
                if(numex) return (positive ? ans : -1 * ans);
                numsign++;
                if(numsign >= 2) return 0;
                continue;
            }
            
            if(s.charAt(i) < '0' || '9' < s.charAt(i)){
                break;
            }
            
            //ここまでくれば数字
            numex = true;
            if(ans > Integer.MAX_VALUE / 10 || 
               (ans == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)){
                return (positive ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
               
            ans = ans * 10 + (s.charAt(i) - '0');
        }
        
            return (positive ? ans : -1 * ans);
    }
}
*/

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        boolean pos = true;
        int num_sign = 0;
        int ans = 0;
        int n = s.length();
        
        while(i < n && s.charAt(i) == ' ') i++;
        
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            num_sign++;
            if(num_sign >= 2) return 0;
            
            if(s.charAt(i) == '-') pos = !pos;
            i++;
        }
        
        if(i < n && s.charAt(i) == '+'){
            num_sign++;
            if(num_sign >= 2) return 0;
            i++;
        }
        if(i < n && s.charAt(i) == '-'){
            num_sign++;
            if(num_sign >= 2) return 0;
            i++;
            pos = !pos;
        }
        
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            if(ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && s.charAt(i) - '0' > Integer.MAX_VALUE%10)){
                return (pos ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
            ans = ans * 10 + (s.charAt(i) - '0');
            i++;
        }
        return (pos ? ans : -1*ans);
    }
}
