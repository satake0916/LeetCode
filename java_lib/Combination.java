package java_lib;

class Combination{
    //パスカルの三角形
    final int MOD = (int)1e9+7;
    int MAX = 2000;
    long[][] com = new long[MAX][MAX];
    public void combination(){
        for(int i = 0; i < MAX; i++)
            com[i][0] = 1;
        for(int i = 1; i < MAX; i++) {
            for(int j = 1; j <= i; j++) {
                com[i][j] = com[i-1][j-1] + com[i-1][j];
                com[i][j] %= MOD;
            }
        }
    }
}