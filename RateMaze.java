 class RateMaze {
     public static boolean isSafe(int i,int j ,int n,int arr[][]){
         if(i<0 ||j<0||i>=n||j>=n||arr[i][j]==0){
             return false;
         }
         return true;
     }

     public static void getWays(int arr[][],String str,int n,int i,int j,int visited[][]){
         if(arr[i][j]==0){
             return ;
         }
         if(i==n||j==n){
             return ;
         }
        if(i==j && i==n-1){
            return ;
        }
        visited[i][j]=1;
         //down
         if(isSafe(i+1,j,n,arr) && visited[i+1][j]==0){
            getWays(arr, str+"D", n, i+1, j, visited);
        }
        //left
        if(isSafe(i,j-1,n,arr) && visited[i][j-1]==0){
            getWays(arr, str+"L", n, i, j-1, visited);

        }
        //right
        if(isSafe(i,j+1,n,arr) && visited[i][j+1]==0){
            getWays(arr, str+"R", n, i, j+1, visited);
        }
        
        //up
        if(isSafe(i-1,j,n,arr) && visited[i-1][j]==0){
            getWays(arr, str+"U", n, i-1, j, visited);

        }
        visited[i][j]=0;
        return ;
     }
    public static String findWays(int arr[][]){
        String str ="";
        int visited[][] = new int[arr.length][arr.length];
        getWays(arr,str,arr.length,0,0,visited);
        System.out.println(str);
        return str;
    }
    public static void main(String args[]){
       
        int arr[][] = { {1 ,0 ,0, 0} ,{1, 1, 0, 1}, {1, 1, 0, 0} ,{0, 1, 1, 1}};

        System.out.println(findWays(arr));
        
    }
}
