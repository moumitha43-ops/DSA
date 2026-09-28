class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(String.valueOf(i));
        }
        Collections.sort(l);
        List<Integer> list = new ArrayList<>();
        for(String s : l){
            list.add(Integer.parseInt(s));
        }return list;
    }
}