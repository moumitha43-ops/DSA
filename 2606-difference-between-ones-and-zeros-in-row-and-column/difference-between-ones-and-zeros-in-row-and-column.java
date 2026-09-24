class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            int a = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    a++;
                }
            }
            row[i]=a;
        }
        for(int i=0;i<grid[0].length;i++){
            int a = 0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    a++;
                }
            }
            col[i]=a;
        }
        int[][] ans = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=row[i]+col[j]-(grid.length-row[i])-(grid[0].length-col[j]);
            }
        }return ans;
    }
}