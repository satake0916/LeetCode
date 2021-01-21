/*
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<Nums, List<Integer>> mp = new HashMap<>();
        int n = strs.length;
        for(int i = 0 ;i < n; i++){
            Nums temp = new Nums(strs[i]);
 

            if(mp.containsKey(temp)){
                mp.get(temp).add(i);
            }else{
                var ne = new ArrayList<Integer>();
                ne.add(i);
                mp.put(temp, ne);
            }
        }

        for(var item: mp.values()){
            var temp = new ArrayList<String>();
            for(int i: item) temp.add(strs[i]);
            ans.add(temp);
        }

        return ans;
    }

    class Nums{
        int[] part;

        public Nums(String s){
            part = new int[26];
            Arrays.fill(part, 0);
            for(int j = 0; j < s.length(); j++){
                part[s.charAt(j) - 'a']++;
            }
        }

        @Override
        public boolean equals(Object o) {
            Nums p = (Nums)o;
            if (o instanceof Nums) {
                boolean f = true;
                for(int i = 0; i < 26; i++){
                    if(part[i] != p.part[i]) f = false;
                }
                return f;
            }
            return super.equals(o);
        }
        
        @Override
        public int hashCode() {
            int t = 0;
            for(int i = 0; i < 26; i++) t += part[i];
            return t;
        }
    }
}
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String ns = String.valueOf(c);

            if(!mp.containsKey(ns)) mp.put(ns, new ArrayList<String>());
            mp.get(ns).add(s);
        }

        return new ArrayList<>(mp.values());
    }
}
