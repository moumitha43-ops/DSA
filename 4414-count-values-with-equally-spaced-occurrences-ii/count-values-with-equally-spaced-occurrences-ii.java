class Solution {
    public int countSpecialIntegers(int[] nums) {
            HashMap<Integer,List<Integer>> mp = new HashMap<>();
            int a = 0;
            for(int i=0;i<nums.length;i++){
                if(!mp.containsKey(nums[i])){
                    List<Integer> l =new ArrayList<>();
                    l.add(i);
                    mp.put(nums[i],l);
                }
                else{
                    List l = mp.get(nums[i]);
                    l.add(i);
                    mp.put(nums[i],l);
                }
            }
            for(Map.Entry<Integer,List<Integer>> e : mp.entrySet()){
                List<Integer> l = e.getValue();
                if(l.size()>2){
                    int diff = l.get(1)-l.get(0);
                    int x = 0;
                        
                    for(int i=2;i<l.size();i++){
                        if(l.get(i)-l.get(i-1)!=diff){
                            x=1;
                            break;
                        }
                    }
                    if(x==0){
                        a++;
                    }
                }
            }
    return a;
    }
}