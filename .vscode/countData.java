import java.util.Scanner;

class countData {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        long ans = 0;
        for(int i = 0;i<N;i++){
            if(arr[i]>=0 ){
              ans = arr[i]==0?ans+1:ans+arr[i];
            }
        }
        System.out.println(ans);
    }
}
