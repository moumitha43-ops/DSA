class Solution {
    public int[] evenOddBit(int n) {
        int res[] = new int[2];
        Arrays.fill(res,0);
        int c=0;
      while(n>0){
        if(n%2==1){
            if(c%2==0){
                res[0]++;
            }
            else{
                res[1]++;
            }
        }
        c++;
        n/=2;
      }  return res;
    }
}