class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
           if(!mp.containsKey(nums[i])){
            mp.put(nums[i],new ArrayList());
           }
           List<Integer> l = mp.get(nums[i]);
           l.add(i);
           mp.put(nums[i],l);
        }
        for (Map.Entry<Integer,List<Integer>> e : mp.entrySet()){
            List<Integer> l = e.getValue();
            if(l.size()==3){
                if(l.get(2)-l.get(1)==l.get(1)-l.get(0)){
                    cnt++;
                }
            }
        }return cnt;
    }
}