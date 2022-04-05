import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    static  int search(ArrayList<Integer> nums) {
        int low = 0;
       int high = nums.size()-1;
       while(low <= high){
           int mid = low+(high-low)/2;
           if(nums.get(mid)>nums.get(mid-1) && nums.get(mid)>nums.get(mid+1)){
               return mid;
           } else if(nums.get(mid)<nums.get(mid+1)){
               low = mid+1;
           } else {
               high = mid-1;
           }
       }
       
       return -1; 
   }
    static  int bs(ArrayList<Integer>  nums, int target,int l,int h) {
        int low = l;
       int high = h;
       while(low <= high){
           int mid = low+(high-low)/2;
           if(nums.get(mid)==target){
               return mid;
           } else if(nums.get(mid)<target){
               low = mid+1;
           } else if(nums.get(mid)>target){
               high = mid-1;
           }
       }
       
       return -1; 
   }
   static  int bs1(ArrayList<Integer> nums, int target,int l,int h) {
        int low = l;
       int high = h;
       while(low <= high){
           int mid = low+(high-low)/2;
           if(nums.get(mid)==target){
               return mid;
           } else if(nums.get(mid)<target){
              high = mid-1;
           } else if(nums.get(mid)>target){
               low = mid+1;
           }
       }
       
       return -1; 
   }
   public  static int solve(ArrayList<Integer> A, int B) {
       int pivot = search(A);
       if(B == A.get(pivot)){
           return pivot;
       }
           int ans = bs(A,B,0,pivot-1);
    if(ans!=-1){
        return ans;
    } else {
        return bs1(A,B,pivot,A.size()-1);
    }

     
       
       
   }
   public static void main(String args[]){
    int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
    ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());

    int B = 12;
    
    System.out.println(solve(list,B));

   }
}
