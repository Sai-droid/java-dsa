import java.util.Arrays;

class RemoveDuplicates {

    public static String ArrayDuplicates(char arr[], int n) {
        int index = 0;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                arr[index] = arr[i];
                index = index + 1;

            }
        }

        return String.valueOf(Arrays.copyOf(arr, index));

    }
 
        public static char findTheDifference(String s, String t) {
                char charCode = t.charAt(s.length());
                System.out.println(charCode);

            // Iterate through both strings and char codes
            for (int i = 0; i < s.length(); ++i) {
                  charCode -= s.charAt(i);
                  System.out.println(charCode);
                  charCode += t.charAt(i); 
                  System.out.println(charCode);
            }
            return charCode;
        }
        public static int minimumOperations(int[] nums) {
            int n = nums.length;
            int even = nums[0];
            int odd = nums[1];
            int count = 0;
            int temp[] = new int[n];
            temp[0]= nums[0];
          
            for(int i =2;i<=n-1;i++){
                
                if(i%2==0){
                    if(nums[i]!=even){
                        ++count;
                        temp[i]= even;
                    }
                } else
                {
                    if(nums[i]!=odd){
                        ++count;
                        temp[i]=odd;
                    }
                }
            }
            int max = 3;
            int count2 =0;
            for(int i = 2;i<n&&max<n;i++){
                if(temp[i]==even && temp[max]==odd){
                    // System.out.println(temp[i]+" ");
                    count2++;
                    max = max+1;
                }
            }
            System.out.println(count2);
            return count;
        }

    public static void main(String args[]) {
        // char arr[] = "saicharankalakondz".toCharArray();
        // // System.out.println(ArrayDuplicates(arr, arr.length));
        // System.out.println(findTheDifference("abc","abcd"));
        // System.out.println((char)'z'-'A');
        int ar[] = {69,91,47,74,75,94,22,100,43,50,82,47,40,51,90,27,98,85,47,14,55,82,52,9,65,90,86,45,52,52,95,40,85,3,46,77,16,59,32,22,41,87,89,78,59,78,34,26,71,9,82,68,80,74,100,6,10,53,84,80,7,87,3,82,26,26,14,37,26,58,96,73,41,2,79,43,56,74,30,71,6,100,72,93,83,40,28,79,24};
    System.out.println(minimumOperations(ar)+" "+ar.length);
    }
}
