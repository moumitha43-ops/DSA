class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int c = 0;
        int d = piles.length-2;
        int n = piles.length/3;
        
        for(int i=0;i<n;i++){
            c+=piles[d];
            d-=2;
            
        }
        return c;
    }
}