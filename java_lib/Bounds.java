package java_lib;

//https://qiita.com/sk7771188/items/dd53b76d38ef26660ce3 よりコピペ
class Bounds{
    public int lowerbound(int[] a, int key) {
        if(a[a.length-1] < key)
            return a.length;
        int lb = 0, ub = a.length-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a[mid] < key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }

    public int upperbound(int[] a, int key) {
        if(a[a.length-1] <= key)
            return a.length;
        int lb = 0, ub = a.length-1, mid;
        do {
            mid = (ub+lb)/2;
            if(a[mid] <= key)
                lb = mid + 1;
            else
                ub = mid;
        }while(lb < ub);
        return ub;
    }

    public int count(int[] a, int key) {
        return upperbound(a, key) - lowerbound(a, key);
    }
}