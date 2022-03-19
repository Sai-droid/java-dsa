class Selectionsort {

    public static void selectionsorting(int arr[]) {
        int n = arr.length;
        System.out.println("before sorting");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int j = 0;
                int index =0;
            for (j = i; j < n; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
              
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            
              
        

        }
        System.out.println("After sorting");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubblesort(int arr[]){
        int n = arr.length;
        System.out.println("before sorting");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
      
        for(int i = 1;i<n;i++){
                for(int j = 0;j<=n-2;j++){
                    if(arr[j]>arr[j+1]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1]= temp;
                    }
                }
        }
        System.out.println("After sorting");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 6, 0, 4, 2 ,5,7,8};
         selectionsorting(arr);
        bubblesort(arr);
    }
}