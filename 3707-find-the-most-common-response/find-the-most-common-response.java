class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> mp = new HashMap<>();
        List<String> ss =new ArrayList<>();
        int m = Integer.MIN_VALUE;
        for(List<String> l:responses){
            Set<String> hs=new HashSet<>(l); 
            for(String s:hs){
                mp.put(s,mp.getOrDefault(s,0)+1);
                m=Math.max(m,mp.get(s));
            }
        }
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            if(e.getValue()==m){
                ss.add(e.getKey());
            }
        }
        Collections.sort(ss);
        return ss.get(0);

    }
}