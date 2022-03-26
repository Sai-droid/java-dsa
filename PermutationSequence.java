import java.util.*;

class PermutationSequence {

    public static void rightrotate(int l, int r, int nums[])
    {
        if (l == r)
            return;
        int temp = nums[r];
        for (int i = r; i > l; i--)
        {
            nums[i] = nums[i - 1];
        }
        nums[l] = temp;

    }

    public static void leftrotate(int l, int r, int nums[])
    {
        if (l == r)
            return;
        int temp = nums[l];
        for (int i = l; i < r; i++)
        {
            nums[i] = nums[i + 1];
        }
        nums[r] = temp;
    }

    public static String permute(int n, int i, int k, int str[], List<List<String>> result,int target) {
        if (i == str.length - 1 && target==0) {
            String s = "";
            for (int a = 1; a < str.length; a++) {
                s += str[a];
            }
            List<String> li = new ArrayList<>();
            li.add(s);
            result.add(li);

            return "";
        }

        
        if (i == str.length) {
            return "";
        }
        for (int j = i,t=target; j < str.length; j++,t--) {

            rightrotate(i, j, str);

            permute(n, i + 1, k-1, str, result,t);
            leftrotate(i, j, str);

        }
        return "";
    }

    public static String getPermutation(int n, int k) {
        List<List<String>> result = new ArrayList<>();
        int str[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            str[i] = i;
        }
        int target = k;
        permute(n, 0, k , str, result,target);

        String z = "";
        for (int i = 0; i < result.get(0).size(); i++) {
            z = z + result.get(0).get(i);
        }
        System.out.println(result);
        return z;

    }

    public static void main(String args[]) {
        System.out.println(getPermutation(9, 54494));
    }

}

// public class Solution {
//     public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
//     }
// }

// [1,2,3] will have the following permutations:

// [1,2,3]
// [1,3,2]
// [2,1,3] 
// [2,3,1] 
// [3,1,2] 
// [3,2,1]