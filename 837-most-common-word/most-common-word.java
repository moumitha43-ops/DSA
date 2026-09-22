class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> mp = new HashMap<>();
        String[] par  = paragraph.toLowerCase().split("[^a-z]+");
        int maxi = Integer.MIN_VALUE;
        for(String s:par){
            mp.put(s.toLowerCase(),mp.getOrDefault(s.toLowerCase(),0)+1);
        }
        for(String s:banned){
            if(mp.containsKey(s.toLowerCase())){
                mp.remove(s.toLowerCase());
            }
        }
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            maxi=Math.max(maxi,e.getValue());
        }
        System.out.println(mp);
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            if(e.getValue()==maxi){
                return e.getKey();
            }
        }
        return "";
    }
}