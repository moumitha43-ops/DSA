class Solution {
    public int maxSubArray(int[] nums) {
        /* TO PRINT ALL SUBARRAYS
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j= i;j<n;j++){
                sum+=nums[j];
                if(sum>maxi) maxi = sum;
            }
        }*/
        //Kadane's Algorithms - IMP
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            maxi = Math.max(maxi,sum);
            if(sum<0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}