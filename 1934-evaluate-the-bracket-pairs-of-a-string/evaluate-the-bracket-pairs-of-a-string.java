class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> mp=  new HashMap<>();
        for(List<String> l:knowledge){
            mp.put(l.get(0),l.get(1));
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
           if(s.charAt(i)=='('){
            StringBuilder sbs = new StringBuilder();
            i++;
            while(s.charAt(i)!=')' && i!=s.length()){
                sbs.append(s.charAt(i));
                i++;
            }
            if(mp.containsKey(sbs.toString())){
                sb.append(mp.get(sbs.toString()));
            }
            else{
                sb.append("?");
                
            }i++;
           }
           else{
           sb.append(s.charAt(i));
           i++;}
        }
        return sb.toString();
    }
}