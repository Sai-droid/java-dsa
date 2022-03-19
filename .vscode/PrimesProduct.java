import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimesProduct {
    public static void main(String[] args) throws java.lang.Exception {
        int n = 1000000;
        int primes[] = new  int[n + 1];
        for (int i = 1; i <= n; i++) {
            primes[i] = 1;
        }
        primes[1] = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == 1) {
                for (int j = i; j * i <= n; j++) {
                    primes[j * i] = 0;
                }

            }
        }
       List<Integer> B = new ArrayList<Integer>();

        for(int i = 2;i<primes.length;i++){
            if(primes[i]==1){
                B.add(i);
            }
        }
    

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int L = sc.nextInt();
            int R = sc.nextInt();
            int resAr[] = new int[R-L+1];
            for(int i = 0;i<resAr.length;i++){
                resAr[i]=1;
            }

            for(int i = 0;i<B.size();i++){
                int K = (int)Math.ceil(1.0 * L/B.get(i));
                for(int j = Math.max(K,2);j*B.get(i)<=R;j++){
                    resAr[( j * B.get(i))-L] = 0;
                
                }
            }
                
           int m = (int)Math.pow(10,9)+7;
            long result = 1;

            for(int i = 0;i<resAr.length;i++){
                if(resAr[i]==1){
                    int  temp = i+L;
                    result = ((result%m)*(temp%m))%m;
                }
               
            }
            System.out.println(result);

        }


        
    }
}

