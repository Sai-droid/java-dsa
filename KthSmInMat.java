
/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KthSmInMat {
    static int count(int m, int a[][]) {
        int ans = 0;
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int l = 0;
            int h = N - 1;
            if(a[i][N-1]>m){
                continue;
            }
            while (l <= h) {
                int mid = l + (h - l) / 2;
                
                if (mid < m) {
                    l = mid + 1;
                } else if (mid > m) {
                    if (a[i][mid-1] <= m) {
                        ans = ans + mid;
                        break;
                    } else {
                        h = mid - 1;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m[][] = new int[N][N];
        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++) {
                m[a][b] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int row = 0, col = m.length - 1;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, m[i][row]);
            max = Math.max(max, m[i][col]);
        }
        System.out.println(min + " " + max);
        int l = min;
        int h = max;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int cnt = count(mid, m);
            
         if(cnt<=k){
             l = mid+1;
         } else {
             int cnt1 = count(mid-1,m);
             if(cnt1<k){
                 System.out.println(mid);
             }else {
                h = mid-1;
             }
         }



            }

        
    }
}

// 3 1 5 9 10 11 13 12 13 15 8
