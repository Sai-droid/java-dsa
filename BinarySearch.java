import java.util.Arrays;
import java.io.*;

class BinarySearch {

    static int Bsearch(int arr[], int l, int r, int key) {

      if(l<=r && l<=arr.length-1){

          int mid = (l+r)/2;
        
          if(arr[mid]==key){
              return mid;
          } else {
              if(arr[mid]<key){
                return Bsearch(arr,mid+1,r,key);
              } else{
                return Bsearch(arr,l,mid,key) ;
              }
          
        }
       }
        return -1;
    }
       
//    static int Bsearch(int arr[], int l, int r, int x)
//     {
//         // Restrict the boundary of right index
//         // and the left index to prevent
//         // overflow of indices
//         if (r >= l && l <= arr.length - 1) {
 
//             int mid = l + (r - l) / 2;
 
//             // If the element is present
//             // at the middle itself
//             if (arr[mid] == x)
//                 return mid;
 
//             // If element is smaller than mid, then it can
//             // only be present in left subarray
//             if (arr[mid] > x)
//                 return Bsearch(arr, l, mid - 1, x);
 
//             // Else the element can only be present
//             // in right subarray
//             return Bsearch(arr, mid + 1, r, x);
//         }
 
//         // We reach here when element is not present in
//         // array
//         return -1;
//     }
 
    

    public static void main(String args[]) {
        int arr[] = { 1};
        int max = Arrays.stream(arr).max().getAsInt();
        int l = 0;
        int r = arr.length-1;
        int key = 5;
        int elementIndex =  Bsearch(arr, l, r, key);
        System.out.println(arr[elementIndex]+" index is: "+ elementIndex );
       System.out.println("Largest in given array is " +max);

    }
}
