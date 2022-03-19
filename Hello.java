class Hello {
     static int countMinOperations(int arr[], int n) {
        // code here
        int min =Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
          min = Math.min(min,arr[i]);
        }
        int count = n;
        int ans = 1;
        while(ans<min){
            count++;
            ans = ans*2;
        }
        int temp = ans;
        
        for(int i=0;i<n;i++){
            ans = temp;
            while(ans!=arr[i]){
                ans = ans+1;
                count++;
            }
        }
        return count+1;
    }
    public static void main (String[] args){
     
        // int arr2[] = {2,3};
        // System.out.println(countMinOperations(arr2,2));
        System.out.println("hello ");
        System.out.println("world");

        String str1 = "james";
        String str2 = new String("james");
        str2.intern();
        System.out.println(str1==str2);
    }
}

// Bruno Mars - Talking To The Moon (Lyrics)
