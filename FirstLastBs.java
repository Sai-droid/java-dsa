/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 class FirstLastBs
{
    public static int startIndex(int arr[],int key){
	boolean flag = false;
	int low = 0;
	int high = arr.length-1;
	while(low<=high){
	    int mid = (low +(high-low)/2);
	    if(arr[mid]<key){
		low = mid+1;
	    }
	    if(arr[mid]>key){
		high = mid-1;
	    }
	    if(arr[mid]==key){
		if(mid==0){
		   return mid;
		}
		if(arr[mid-1]!=key){
		     return mid;
		} else{
		    high = mid-1;
		}
	    }
	    
	}
	return -1;
    }
     public static int endIndex(int arr[],int key){
	boolean flag = false;
	int low = 0;
	int high = arr.length-1;
	while(low<=high){
	    int mid = (low +(high-low)/2);
	    if(arr[mid]<key){
		low = mid+1;
	    }
	    if(arr[mid]>key){
		high = mid-1;
	    }
	    if(arr[mid]==key){
		if(mid==arr.length-1){
		   return mid;
		}
		if(arr[mid+1]!=key){
		   return mid;
		} else{
		    high = mid+1;
		}
	    }    
	}
	 return -1;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine().trim());
                 String[] str = br.readLine().trim().split("\\s+");

	int arr[] = new int[N];
	for(int i =0;i<N;i++){
	    arr[i] = Integer.parseInt(str[i].trim());
	}
	int T = Integer.parseInt(br.readLine().trim());
	while(T-->0){
	    int key = Integer.parseInt(br.readLine().trim());
	   int x =  startIndex(arr,key);
	   int y = endIndex(arr,key);
	    if(x!=-1 && y!= -1 && x!=y){
		System.out.print((x+1)+" "+ (y+1));
	    }
	        if(x!=-1 && y!= -1 && x==y){
		System.out.print(x+1);
	    }
	        if(x==-1 && y== -1){
		System.out.print(-1);
	    }
	  
	    System.out.println();
	}
    }
}
// 5 1 3 3 4 5 2 3 2
// 2
// 3
// 2