class Solution {
    public int minSetSize(int[] arr) {
        int freq[]=new int[100001];
        int sum = 0, count = 0;
        for(int n : arr){
            freq[n]++;
        }  
        Arrays.sort(freq);
        for(int i=100000;i>=0;i--){
            sum+=freq[i];
            count++;
            if(sum>=arr.length/2){
                return count;
            }
        }
    return count;
    }
}