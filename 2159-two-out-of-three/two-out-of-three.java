class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,List<Integer>> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums1){
            List<Integer> l = new ArrayList<>();
            l.add(0);
            mp.put(i,l);
        }
        for(int j:nums2){
            
            if(!mp.containsKey(j)){
                List<Integer> l = new ArrayList<>();
                l.add(1);
                mp.put(j,l);
            }
            else{
                List<Integer> l = mp.get(j);
                l.add(1);
                mp.put(j,l);
            }
        }
        for(int j:nums3){
            
            if(!mp.containsKey(j)){
                List<Integer> l = new ArrayList<>();
                l.add(2);
                mp.put(j,l);
            }
            else{
                List<Integer> l = mp.get(j);
                l.add(2);
                mp.put(j,l);
            }
        }
        for(Map.Entry<Integer,List<Integer>> e : mp.entrySet()){
            Set<Integer> s = new HashSet<>(e.getValue());
            if(s.size()>1)
            list.add(e.getKey());
        }
        System.out.println(mp);
        return list;
    }
}