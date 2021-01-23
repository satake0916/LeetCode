class Solution {
    public int firstUniqChar(String s) {
        int[] f = new int[26];
        Arrays.fill(f, 0);
        for(int i = 0; i < s.length(); i++) f[s.charAt(i) - 'a']++;
        for(int i = 0; i < s.length(); i++){
            if(f[s.charAt(i) - 'a'] < 2) return i;
        }
        return -1;
    }
}
