class Complete{
    
    public static int minSwap (int arr[], int n, int k) {

        int window_size = 0;

        int ans = 0;

        int max = Integer.MIN_VALUE;

        int window_count = 0;

        for(int i=0;i<n;i++){

            if(arr[i]<=k){

                window_size++;

            }

        }

        if(window_size==0){

            ans = 0;

        }

        else{

        for(int i=0;i<window_size;i++){

            if(arr[i]<=k){

                window_count++;

            }

        }

        int value = window_count;

        for(int j=window_count;j<n;j++){

            max = value;

            if(arr[j]<=k){

                value++;

            }

            if(arr[j-window_size] <=k){

                value--;

            }

            max = Math.max(value,max);

        }

        ans = window_size - max;

        }

    return ans;

    }
    public static void main(String args[]){
       int arr[] = {2, 1, 5, 6, 3}; 
int z= 3;
int n = arr.length;
        System.out.println(minSwap(arr,n,z));
    }

}
    
    
