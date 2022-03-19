import java.util.Scanner;
 class Flowers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[M+1];
        for(int i =1;i<=M;i++){
            arr[i] = sc.nextInt();
        }
        
        int pref[] = new int[arr.length];
        int sum = 0;
        for(int i = 1;i<=M;i++){
            sum = sum + arr[i];
            pref[i]= sum;
        }
        int result = 0;
        while(N>0){
            int first = sc.nextInt();
            int second = sc.nextInt();
            if(pref[second]-pref[first-1]>0){
                result = result + pref[second]-pref[first-1];
            }
            N--;
        }
        System.out.println(result);
    }
}
1 -2 1 3 -4
1 2
4 5
3 4
1 4