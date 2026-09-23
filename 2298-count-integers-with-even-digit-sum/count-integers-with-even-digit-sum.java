class Solution {
    boolean even(int n){
        int c=0;
        while(n>0){
            c+=n%10;
            n/=10;
        }
        if(c%2==0)return true;
        return false;
    }
    public int countEven(int num) {
        int count = 0;
        for(int i=2;i<=num;i++){
            if(even(i)){
                count++;
            }
        }return count;
    }
}