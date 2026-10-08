class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0,end = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==')'){
                st.pop();
                if(st.isEmpty()){
                    end = i;
                     for(int j=start+1;j<end;j++){
                        sb.append(s.charAt(j));
                     }
                     start = end+1;
                }
            }else{
            st.push(c);
            }
            
        }
        return sb.toString();
    }
}