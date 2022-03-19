import java.util.*;

class MaxExpr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        long p = (long)sc.nextInt();
        long q = (long)sc.nextInt();
        long r =(long) sc.nextInt();

        long arr[] = new long[(int)n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long)sc.nextLong();
        }
 
            long lMax[] = new long[n];
            long rMax []= new long[n];


            lMax[0]= p*arr[0];
        for (int i=1; i < n; i++) {
            lMax[i] = Math.max(lMax[i-1], p* arr[i]);
        }
        rMax[n-1]=r*arr[n-1];
        for (int i =n-2; i>=0; i--) {
            rMax[i] = Math.max(rMax[i+1], r* arr[i]);
        }
        long resultMax=  Long.MIN_VALUE;;
       for(int i =0;i<n;i++){
            resultMax = Math.max(resultMax,lMax[i]+rMax[i]+arr[i]*q);
       }
       System.out.println(resultMax);
       
sc.close();
    }

}