class Solution {
public:
    int numUniqueEmails(vector<string>& emails) {
        int count = 0;
        unordered_set<string> st;
        for(string email: emails){
            string currectEmail = "";
            int n = email.size();
            bool ignore = false;
            for(int i = 0; i < n; i++){
                if(email[i] == '@'){
                    currectEmail += email.substr(i);
                    break;
                }
                if(ignore) continue;
                if(email[i] == '.'){
                    continue;
                }else if(email[i] == '+'){
                    ignore = true;
                }else{
                    currectEmail += email[i];
                }
            }
            //cout << currectEmail << endl;
            if(st.insert(currectEmail).second) count++;
        }
        return count;
    }
};
