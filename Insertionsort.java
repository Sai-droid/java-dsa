class Insertionsort {

    public static void sorting(int arr[]) {
        int n = arr.length;
        System.out.println("Before sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 6, 0, 4, 2 };
        sorting(arr);
    }
}
