import java.util.*;

class Nqueens {

    public static boolean isSafe(int i ,int j ,int arr[][],int n){
        int x = i-1;
        while(x>=0){
            if(arr[x][j]==1){
                return false;
            }
            x--;
        }
        x= i-1;
      int   y= j-1;
        while(x>=0 && y>=0){
            if(arr[x][y]==1){
                return false;
            }
            x--;
            y--;
        }
        x=i-1;
        y= j+1;

        while(x>=0 && y<n){
            if(arr[x][y]==1){
                return false;
            }
            x--;
            y++;
        }
        return true;
    }
    public static void printConfigurations( List<List<String>> list, int i,int arr[][],int n,boolean flag){
        if(flag){
            return ;
        }
        if(i==n){
            flag = true;
            List<String> ans = new ArrayList<>();
           
            for(int k = 0;k<n;k++){
                String str = "";
                for(int j = 0;j<n;j++){
                    if(arr[k][j]==1){
                        str = str+"Q";
                    } else{
                        str = str+".";
                    }
                }
                ans.add(str);
            }
            
            list.add(ans);
            return ;
        }

        for(int j = 0;j<arr.length;j++){
            if(isSafe(i,j,arr,n)){
                arr[i][j]= 1;
                printConfigurations( list,i+1,arr,n,flag);
                arr[i][j]=0;
            }
        }
        
    }

    public static  List<List<String>> solveNQueens(int n) {
        int arr[][] = new int[n][n];
        boolean flag = false;
        List<List<String>> list = new ArrayList<>();
        printConfigurations(list,0,arr,n,flag);
        System.out.println(list);
        return list;
    }


    public static void main(String args[]){
  
        solveNQueens(1);
    }
}
