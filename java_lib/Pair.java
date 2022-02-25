package java_lib;

//https://qiita.com/p_shiki37/items/3902f4e3adc3aeb382f1 よりコピペ
class Pair implements Comparable<Pair> {
    int a,b;
    public Pair(int a,int b) {
        this.a = a;
        this.b = b;
    }

    //(a,b)が一致
    @Override
    public boolean equals(Object o) {
        if (o instanceof Pair) {
            Pair p = (Pair) o;
            return a == p.a && b == p.b;
        }
        return super.equals(o);
    }

    /* 
     * x.equals(y) ならば hashCode(x) == hashCode(y)でなければならない。
     * この実装では同じハッシュ値をもつペアを容易に見つけられるため、ハッシュとしては弱い。
     */
    @Override
    public int hashCode() {
        return a ^ b;
    }

    //辞書順比較
    @Override
    public int compareTo(Pair o) {
        if (a != o.a) {
            return Integer.compare(a, o.a);
        }
        return Integer.compare(b, o.b);
    }
}