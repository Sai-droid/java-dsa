
class UniquePaths3 {
    public static boolean isSafe(int i, int j, int arr[][], int m, int n) {
        if (i >= m || j >= n || i < 0 || j < 0 || arr[i][j] == -1) {
            return false;
        }
        return true;
    }
 
    public static int getCount(int arr[][], int visited[][], int i, int j, int result) {
        
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        if (isSafe(i, j, arr, m, n) && arr[i][j] == 2) {
            if(result<0){
                return 1;
            } else{
                return 0;
            }
        } 
      
        visited[i][j] = 1;
 
        if (isSafe(i + 1, j, arr, m, n) && visited[i + 1][j] == 0) {
            
 
          count +=  getCount(arr, visited, i + 1, j, result - 1);
 
        }
 
        if (isSafe(i - 1, j, arr, m, n) && visited[i - 1][j] == 0) {
            count +=    getCount(arr, visited, i - 1, j, result - 1);
 
        }
 
        if (isSafe(i, j + 1, arr, m, n) && visited[i][j + 1] == 0) {
           
            count +=   getCount(arr, visited, i, j + 1, result - 1);
 
        }
        if (isSafe(i, j - 1, arr, m, n) && visited[i][j - 1] == 0) {
          
            count +=  getCount(arr, visited, i, j - 1, result - 1);
 
        }
 
        visited[i][j] = 0;
        return count;
    }
 
    public static int uniquePathsIII(int[][] grid) {
        int result = 0;
        int row = 0;
        int col = 0;
 
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row = i;
                    col = j;
                }
                if (grid[i][j] == 0) {
                    result++;
                }
            }
        }
        int visited[][] = new int[grid.length][grid[0].length];
        return getCount(grid, visited, row, col, result);
 
    }
 
    public static void main(String args[]) {
        int grid[][] = {{1,0},{0,2}};
        System.out.println(uniquePathsIII(grid));
    }
}