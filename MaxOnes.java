class MaxOnes {
 static   int rowWithMax1s(int arr[][], int n, int m) {
        int max = 0;
        // code here
        int index = 0;


        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = 0;j<m;j++){
                sum = arr[i][j];
                arr[i][j]= sum + arr[i][j];
            }
        }
      

        for(int  i = 0;i<n;i++){
           int  end = arr[i].length-1;
           if(max<arr[i][end]){
            max = arr[i][end];
                index = i;
            }
         
        }
        
        return index;
    }


    public static void main(String args[]){
      int  Arr[][] = {{0, 1, 1, 1},
      {0, 0, 1, 1},
      {1, 1, 1, 1},
      {0, 0, 0, 0}};
        int r = Arr.length;
        int c = Arr[0].length;
        System.out.println(rowWithMax1s(Arr,r,c));
    }
}