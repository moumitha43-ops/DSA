class Solution {
    boolean prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=2;i<100;i++){
            if(prime(i)){
                mp.put(i,0);
            }
        }
        int left = 0;
        int right = 0;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                left = i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(mp.containsKey(nums[i])){
                right = i;
                break;
            }
        }
        if(left==right)return 0;
        return right-left;
    }
}