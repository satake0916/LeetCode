package java_lib;

import java.util.Arrays;

//Mapのキーとして使える
class ContainedAlphabet{
    int[] counts;

    public ContainedAlphabet(String s){
        counts = new int[26];
        Arrays.fill(counts, 0);
        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
        }
    }

    @Override
    public boolean equals(Object o) {
        ContainedAlphabet CA = (ContainedAlphabet)o;
        if (o instanceof ContainedAlphabet) {
            boolean f = true;
            for(int i = 0; i < 26; i++){
                if(counts[i] != CA.counts[i]) f = false;
            }
            return f;
        }
        return super.equals(o);
    }
    
    @Override
    public int hashCode() {
        int t = 0;
        for(int i = 0; i < 26; i++) t += counts[i];
        return t;
    }
}