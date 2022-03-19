 class InsertElement {
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,3,5,7,6};
        int arr2[] = new int[]{1,2,3,4,5};
        // 12934
            int n = arr.length-1;
        // 1 2 3 5 7 6

        for(int i =2;i<n;i++ ){
            arr[i]= arr[i+1];
        }

        for(int i = arr2.length-1;i>2;i--){
            arr2[i]= arr2[i-1];
        }
        arr2[2]=9;
        for(int i =0;i<n;i++ ){
            System.out.println(arr[i]);
        }

        for(int j =0;j<arr2.length;j++){
            System.out.println(arr2[j]);
        }
    }
}