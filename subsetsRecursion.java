import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
 import java.util.List;

class subsetsRecursion {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, subsets, new ArrayList<Integer>());

        return subsets;

    }

    public static  void generateSubsets(int[] nums, int index, List<List<Integer>> subsets, List<Integer> currentList) {

        subsets.add(new ArrayList<Integer>(currentList));

        for(int j=index;j<nums.length;j++) {

            currentList.add(nums[j]);

            generateSubsets(nums, j+ 1, subsets, currentList);

            currentList.remove(currentList.size() - 1);

        }
       
    }
    public static void main(String args[]){
        int arr[] = {15,5,3 };
            System.out.println(subsets(arr));
    }

}