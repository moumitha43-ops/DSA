class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]*=-1;
            }
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        long sum=0;
        while(i<j){
            sum+=nums[j]*nums[j];
            sum-=nums[i]*nums[i];
            i++;
            j--;
        }
        if(nums.length%2==1){
            sum+=nums[i]*nums[i];
        }
        return sum;
    }
}