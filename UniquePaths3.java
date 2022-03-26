 class UniquePaths3 {
     public static boolean isSafe(int i ,int j,int m,int n,int a[][]){
        if(i<m && j<n && i>=0 && j>=0){
            if(a[i][j]==0){
                return false;
            } 
            return true;
        }
        return false;
     }
     public static int paths(int i ,int j,int m ,int n,int[][]a){
        int sum = 0;
        int visited[][] = new int[m][n];
        if(a[i][j]==1 && i==m-1 && j==n-1){
            return 1;
        }
        visited[i][j]=1;
        //right
        if(isSafe(i,j+1,m,n,a) && visited[i][j+1]!=1){
            sum = sum+paths(i,j+1,m,n,a);
        }
        //left
        if(isSafe(i,j-1,m,n,a) && visited[i][j-1]!=1){
            sum = sum+paths(i,j-1,m,n,a);
        }
        //top
        if(isSafe(i-1,j,m,n,a) && visited[i-1][j]!=1){
            sum = sum+paths(i-1,j,m,n,a);
        }
        //down
        if(isSafe(i+1,j,m,n,a) && visited[i+1][j]!=1){
            sum = sum+paths(i+1,j,m,n,a);
        }
        visited[i][j]=0;
        return sum;
     }
    public static  int uniquePathsIII(int[][] grid) {
        return paths(0,0,grid.length,grid[0].length,grid);
    }
    public static void main(String args[]){
        int arr[][] ={{1,0,0,0},{1,1,0,1},{0,1,0,0},{0,1,1,1}};
     


        System.out.println(uniquePathsIII(arr));
    }    
}
