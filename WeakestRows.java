import java.util.Arrays;
import java.util.Comparator;

class WeakestRows {
    public static  void Sort2DArrayBasedOnColumnNumber (int[][] array, final int columnNumber){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
               if(first[columnNumber-1] > second[columnNumber-1]) return 1;
               else return -1;
            }
        });
    }
    public static void main(String args[]){
        int [][] arr = {{1,2,3},{4,5,6},{2,4,5}};
        Sort2DArrayBasedOnColumnNumber(arr,1);
        System.out.println(arr[1][0]);

    }
}
