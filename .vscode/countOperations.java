class countOperations {

    
    public static void main(String args[]){
        int arr[] = {3,1,3,2};
        int odd[] = new int[arr.length];
        int even[] = new int[arr.length];
        int count = 0;
        for(int i = 0;i<arr.length-2;i++){
            if(arr[i]!=arr[i+2]){
                count++;
            }
        }
        System.out.println(count);
    }
}