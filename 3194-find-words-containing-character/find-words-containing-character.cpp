class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
        vector<int> a;
        int c=0;
        for(string s:words){
            for(int i=0;i<s.length();i++){
                if(s[i]==x){
                    a.push_back(c);
                    break;
                }
            }c++;
        }return a;
    }
};