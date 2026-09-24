class Solution {
    public String maximumOddBinaryNumber(String s) {
        int a=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                a++;
            }
        }
        a--;
        for(int i=0;i<a;i++){
            sb.append('1');
        }
        for(int i=0;i<s.length()-a-1;i++){
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}