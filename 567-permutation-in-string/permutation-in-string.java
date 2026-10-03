class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        char[] ch  = s1.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        
        for(int i=0;i<=s2.length()-n;i++){
            char[] c = s2.substring(i,i+n).toCharArray();
            Arrays.sort(c);
            String s3 = new String(c);
            
            if(s3.equals(s)){
                return true;
            }
        }
        return false;
    }
}