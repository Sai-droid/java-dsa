 class BinarySearchMultipleOccurances {
    public static int bs(int arr[],int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
          int  mid = (high+low)/2;

          if(arr[mid]>key){
              high = mid-1;
          }
          if(arr[mid]<key){
              low = mid+1;
          }

          if(arr[mid]==key){
            System.out.println(low);
              if(mid==arr.length-1){
                 
                  return mid;
              } 
              if(arr[mid+1]!=key){
                  return mid;
              } else{
                  low = mid+1;
              }
          }
        }
        System.out.println(low);

        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,6};
        bs(arr,5);
        bs(arr,2);
        bs(arr,7);
        bs(arr,0);

    }
}
