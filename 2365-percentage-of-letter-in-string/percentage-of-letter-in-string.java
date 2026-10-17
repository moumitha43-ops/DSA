class Solution {
    public int percentageLetter(String s, char letter) {
        int sum=0;
        for(int c:s.toCharArray()){
            if(c==letter){
                sum++;
            }
        }
        float c = (sum*100)/s.length();
        ;
        return (int)c;
    }
}