class Solution {
    public String arrangeWords(String text) {
        String[] ss = text.toLowerCase().split(" ");
        HashMap<Integer,List<String>> mp = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(String s:ss){
            int n = s.length();
            if(!mp.containsKey(n)){
                mp.put(n,new ArrayList<>());
            }
            List<String> l = mp.get(n);
            l.add(s);
            mp.put(n,l);

        }
        System.out.println(mp);
        for(int i=1;i<20;i++){
            if(mp.containsKey(i)){
                for(String s:mp.get(i)){
                    sb.append(s+" ");
                }
            }
        }
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}