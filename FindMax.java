class FindMax {

    static int findM(int arr[], int l, int r) {

        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int x = findM(arr, l, mid);
        int y = findM(arr, mid + 1, arr.length - 1);
        return Math.max(x, y);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 6, 23 };
        int left =0;
        int right = arr.length-1;
        int middle = (left+right)/2;
        System.out.println(middle);
        System.out.println(findM(arr, 0, arr.length - 1));
        int max = 0;
        
        for(int i =0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
        System.out.println(5/3+" "+ 5/9+" "+5/27);
    }
}
