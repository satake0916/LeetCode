package java_lib;

import java.util.*;

class UnionFind{

    int[] parent;
    int[] rank;
    int[] size;

    public UnionFind(int n){
        this.parent = new int[n+1];
        this.rank = new int[n+1];
        this.size = new int[n+1];
        for(int i = 1; i <= n; i++) set(i);
    }

    public void set(int i) {
        parent[i] = i;
        rank[i] = 0;
        size[i] = 1;
    }

    public int find(int i) {
        if (i == parent[i])
            return parent[i];
        else
            return parent[i] = find(parent[i]);
    }

    public boolean same(int x, int y){
        return find(x) == find(y);
    }

    public void unite(int x, int y) {
        int xroot = find(x);
        int yroot = find(y);
        if(xroot == yroot)
            return;
        if(rank[xroot] > rank[yroot]) {
            parent[yroot] = xroot;
            size[xroot] += size[yroot];
        }
        else if(rank[xroot] < rank[yroot]) {
            parent[xroot] = yroot;
            size[yroot] += size[xroot];
        }
        else {
            parent[yroot] = xroot;
            size[xroot] += size[yroot];
            rank[xroot]++;
        }
    }

    public int get_size(int i) {
        return size[find(i)];
    }
    
    public int group_num() {
        Set<Integer> parents = new HashSet<>();
        for(int i = 1; i < this.parent.length; i++)
            parents.add(find(i));
        return parents.size();
    }
}