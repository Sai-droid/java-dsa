import java.util.Scanner;

class AppleDivision {

    static long solve(long arr[],long sum ,long sumb ,int i){
        if(i==arr.length){
            return Math.abs(sum - sumb);
        }
        return Math.min(solve(arr,sum+arr[i],sumb,i+1),solve(arr,sum,sumb+arr[i],i+1));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextLong();
        }
        System.out.println(solve(arr,0,0,0));
        sc.close();
    }
}
