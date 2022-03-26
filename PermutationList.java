import java.util.*;

class PermutationList {
    public static void getPermutations(ArrayList<ArrayList<Integer>> result, int i, ArrayList<Integer> list,int n) {
        if (i == n) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j < list.size(); j++) {
            int temp = list.get(i);
            list.add(i, list.get(j));
            list.add(j, temp);
            getPermutations(result, i + 1, list,n);
            int temp1 = list.get(i);
            list.add(i, list.get(j));
            list.add(j, temp1);
        }
    }

   

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A,int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int arr[] = new int[A.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = A.get(i);
        }
        getPermutations(result, 0,A,n);
        return result;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(permute(list,3));
    }
}
