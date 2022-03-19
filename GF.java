import java.util.*;
  class GF{
 
// Function to print a subString str[low..high]
static void printSubStr(String str, int low, int high)
{
    for (int i = low; i <= high; ++i)
        System.out.print(str.charAt(i));
}
 
// This function prints the
// longest palindrome subString
// It also returns the length1
// of the longest palindrome
static int longestPalSubstr(String str)
{
    // get length of input String
    int n = str.length();
 
    // All subStrings of length 1
    // are palindromes
    int maxLength = 1, start = 0;
 
    // Nested loop to mark start and end index
    for (int i = 0; i < str.length(); i++) {
        for (int j = i; j < str.length(); j++) {
            int flag = 1;
 
            // Check palindrome
            for (int k = 0; k < (j - i + 1) / 2; k++)
                if (str.charAt(i + k) != str.charAt(j - k))
                    flag = 0;
 
            // Palindrome
            if (flag!=0 && (j - i + 1) > maxLength) {
                start = i;
                maxLength = j - i + 1;
            }
        }
    }
 
   
    return maxLength;
}
 
// Driver Code
public static void main(String[] args)
{
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // while(N-->0){
    //     String str = sc.nextLine();
    //     System.out.print(longestPalSubstr(str));
    // }'
    
    int arr[] = new int[4];
    for(int i =0;i<4;i++){
        System.out.println(arr[i]);
    }
   
}
}