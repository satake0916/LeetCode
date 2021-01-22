class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        char[][] area = new char[m+2][n+2];
        boolean[][] f = new boolean[m+2][n+2];
        for(int i = 0; i < m+2; i++){
            for(int j = 0; j < n+2; j++){
                if(i == 0 || j == 0 || i == m+1 || j == n+1){
                    area[i][j] = '0';
                }else{
                    area[i][j] = grid[i-1][j-1];
                }
                f[i][j] = false;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < m+2; i++){
            for(int j = 0; j < n+2; j++){
                if(area[i][j] == '1' && !f[i][j]){
                    ans++;
                    isLand(area, f, new Pair(i, j));
                }
            }
        }
        return ans;
    }
    
    private void isLand(char[][] grid, boolean[][] f, Pair start){
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(start);
        while(!q.isEmpty()){
            var top = q.poll();
            int a = top.a, b = top.b;
            int[] x = {a+1, a-1, a, a};
            int[] y = {b, b, b+1, b-1};
            for(int i = 0; i < 4; i++){
                if(grid[x[i]][y[i]] == '1' && !f[x[i]][y[i]]){
                    f[x[i]][y[i]] = true;
                    q.offer(new Pair(x[i], y[i]));
                }
            }
        }
    }
}

class Pair{
    int a,b;
    public Pair(int a,int b) {
        this.a = a;
        this.b = b;
    }
}
