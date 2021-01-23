class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> valid = new HashSet<>();
        for(String str: emails){
            String[] s = str.split("@");
            String local = s[0], domain = s[1];
            var sb = new StringBuilder();
            for(char c: local.toCharArray()){
                if(c == '.') continue;
                if(c == '+') break;
                sb.append(c);
            }
            valid.add(sb.toString() + "@" + domain);
        }
        return valid.size();
    }
}
