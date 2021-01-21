/*
class Solution {
    public int uniquePaths(int m, int n) {
        combination();
        return com[m+n-2][m-1];
    }
    
    //パスカルの三角形
    int MAX = 200;
    int[][] com = new int[MAX][MAX];
    public void combination(){
        for(int i = 0; i < MAX; i++)
            com[i][0] = 1;
        for(int i = 1; i < MAX; i++) {
            for(int j = 1; j <= i; j++) {
                com[i][j] = com[i-1][j-1] + com[i-1][j];
            }
        }
    }
}
*/

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] r: dp) Arrays.fill(r, 1);
        
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
            
        return dp[m-1][n-1];
    }
}
