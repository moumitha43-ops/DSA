class Solution {
    boolean prime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int l=-1,r=-1;
        while(left<right){
            if(prime(nums[left])){
                l=left;
            }
            if(prime(nums[right])){
                r=right;
            }
            if(l>-1 && r>-1){
                return r-l;
            }
            else if(l==-1){
                left++;
            }
            else{
                right--;
            }
        }return 0;
    }
}