class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int walk = 0;
        int a = capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=capacity){
                walk++;
                capacity-=plants[i];
            }
            else{
                walk+=i+i+1;
                capacity = a;
                capacity-=plants[i];
            }
            System.out.println(capacity+"-"+walk);
        }return walk;
    }
}