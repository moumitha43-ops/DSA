class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int ans[] = new int[2];
        Arrays.fill(ans,-1);
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        Arrays.sort(nums);
        int freq1 = mp.get(nums[0]);
        for(int i=0;i<nums.length;i++){
            if(freq1!=mp.get(nums[i])){
                ans[0]=nums[0];
                ans[1]=nums[i];
                break;
            }
            
        }return ans;
    }
}