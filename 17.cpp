class Solution {
    
vector<string> ret;
    
private:
    void makeCombination(string current, string digits){
        string digitToLetter[9] = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.size() == 0){
            if(current.size() != 0) ret.push_back(current);
        }else{
            string top = digits.substr(0,1);
            string letters = digitToLetter[stoi(top) - 1];
            for(char i : letters){
                makeCombination(current + i, digits.substr(1));
            }
        }
    } 
    
    
public:
    vector<string> letterCombinations(string digits) {
        makeCombination("", digits);
        return ret;
    }
};
