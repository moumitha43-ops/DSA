class Solution {
    public int maxDepth(String s) {
        int m = 0;
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push('(');
                m = Math.max(m,st.size());
            }
            else if(ch==')'){
                st.pop();
            }
        }return m;
    }
}