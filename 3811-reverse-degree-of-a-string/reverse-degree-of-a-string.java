class Solution {
    public int reverseDegree(String s) {
        int a = s.length();
        int c=0;
        for(int i=0;i<a;i++){
            c+=(i+1)*('z'-(int)s.charAt(i)+1);
        }
        return c;
    }
}