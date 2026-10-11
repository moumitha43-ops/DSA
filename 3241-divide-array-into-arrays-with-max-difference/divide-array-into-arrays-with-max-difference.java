class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int matrix[][] = new int[nums.length/3][3];
        for(int i=0;i<nums.length/3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=nums[c++];
            }
            if(matrix[i][2]-matrix[i][0]>k){
                return new int[0][0];
            }
        }return matrix;
    }
}