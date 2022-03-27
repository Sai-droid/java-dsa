import java.util.ArrayList;
import java.util.List;

class UniquePaths2 {
    public static void getCount(int a[][], int i, int j, int count,int m ,int n,List<Integer> list) {
       
    if(a[i][j]==1){
        return ;
    }
    if( i==m-1 && j==n-1)
      {
          list.add(1);
          return ;
      }

        if(i==m-1){
            getCount(a, i, j+1, count, m, n, list);
        } 
        else if(j==n-1){
            getCount(a, i+1, j, count, m, n, list);
        } else{
            getCount(a, i, j+1, count, m, n, list);
            getCount(a, i+1, j, count, m, n, list);
        }
    }

    public static int uniquePathsWithObstacles(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int count = 0;
        List<Integer> ans = new ArrayList<>();
        getCount(a, 0, 0, count,m,n,ans);
    
        return ans.size();
    }

    public static void main(String args[]) {
        int[][] a = {{0,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(a));
    }
}
