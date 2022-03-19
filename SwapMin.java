class SwapMin{
    
  
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int windowSize = 0;
        for(int i = 0;i<n;i++){
         if(arr[i]<=k){     
             windowSize++;
             
         }
    }
        int min = 0;
        for (int i = 0;i<windowSize;i++){
              if(arr[i]<=k){     
             min++;
             
         }
        }
        int minswap = min;
        for(int i = windowSize;i<n;i++){
           
            if(arr[i-windowSize]<=k){
                --min;
            }
             if(arr[i]<=k){
                ++min;
            }
            minswap = Math.max(minswap,min);
            
        }
        
        
        return windowSize-minswap;
    
    
    
    }
    public static void main(String args[]){
        int arr[] = {10,12,20,20,5,19,19,12,1,20,1};
        System.out.println(minSwap(arr,arr.length,11));

        int a[][] = {{1,2,3},{1,2,3}};
        System.out.println(a.length);
        System.out.println(a[0].length);
    }
}