import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Permutations2 {

    public static void permutations(List<List<Integer>> result, int[] nums, int i) {
        if (i == nums.length - 1) {
            ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
            result.add(list);
            return;
        }
        int count[] = new int[26];
        for (int j = i; j < nums.length; j++) {
            if(count[nums[j]+10]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                permutations(result, nums, i + 1);
                int temp1 = nums[j];
                nums[j] = nums[i];
                nums[i] = temp1;
            }
            count[nums[j]+10]++;
        }

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int count[] = new int[26];
        permutations(result, nums, 0);
        System.out.println(result);
        return result;
    }

    public static void main(String args[]) {
        int nums[] = { 1,2,3 };
        permuteUnique(nums);
    }
}
