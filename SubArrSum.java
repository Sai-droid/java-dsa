 class SubArrSum {
     public static void  subArraySum(int arr[],int k ){
         int sum = 0;
         int n = arr.length;
         for(int i = 0;i<k;i++){
                sum = sum + arr[i];
         }

         for(int i = k;i<n;i++){
             System.out.println(sum);
             sum = sum + arr[i]-arr[i-k];

         }
         System.out.println(sum);
     }
     public static void main(String args[]){
         int arr[] = {1,2,3,4,5};
         int k = 3;
      subArraySum(arr,k);
     }
    
}
