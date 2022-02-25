package java_lib;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Prime {
    //因数分解
    Map<Integer, Integer> fact = new HashMap<>();
    public void factorization(int n){
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                int count = 0;
                while(n % i == 0) {
                    n /= i;
                    count++;
                }
                fact.put(i, count);
            }
        }
        if(n > 1)
            fact.put(n, 1);
    }

    //素数判定
    public boolean isprime(int n) {
        if(n <= 1)
            return false;
        else if(n == 2)
            return true;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }

    //エラトステネスの篩
    
    public boolean[] SieveofEratosthenes(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int x = 4; x <= n; x+=2)
            prime[x] = false;
        for(int i = 3; i <= Math.sqrt(n); i+=2)
            if(prime[i])
                for(int x = i * i; x <= n; x+=i)
                    prime[x] = false;
        
        return prime;
    }
}