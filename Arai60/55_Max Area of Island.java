class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] area = new int[m+2][n+2];
        boolean[][] f = new boolean[m+2][n+2];
        for(int i = 0; i < m+2; i++){
            for(int j = 0; j < n+2; j++){
                if(i == 0 || j == 0 || i == m+1 || j == n+1){
                    area[i][j] = 0;
                }else{
                    area[i][j] = grid[i-1][j-1];
                }
                f[i][j] = false;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < m+2; i++){
            for(int j = 0; j < n+2; j++){
                if(area[i][j] == 1 && !f[i][j]){
                    ans = Math.max(ans, isLand(area, f, new Pair(i, j)));
                }
            }
        }
        return ans;
    }
    
    private int isLand(int[][] grid, boolean[][] f, Pair start){
        Queue<Pair> q = new ArrayDeque<>();
        f[start.a][start.b] = true;
        int ret = 1;
        q.offer(start);
        while(!q.isEmpty()){
            var top = q.poll();
            int a = top.a, b = top.b;
            int[] x = {a+1, a-1, a, a};
            int[] y = {b, b, b+1, b-1};
            for(int i = 0; i < 4; i++){
                if(grid[x[i]][y[i]] == 1 && !f[x[i]][y[i]]){
                    f[x[i]][y[i]] = true;
                    q.offer(new Pair(x[i], y[i]));
                    ret++;
                }
            }
        }
        return ret;
    }
}

class Pair{
    int a,b;
    public Pair(int a,int b) {
        this.a = a;
        this.b = b;
    }
}
