import java.util.*;

class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        generateCombinations(1, k, 0, result, n, list);

        return result;
    }

    public static void generateCombinations(int index, int k, int remSum, List<List<Integer>> result, int n,
            List<Integer> list) {

        if (index > 10) {
            return;
        }
        if (remSum == n && list.size() == k) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        list.add(index);
        generateCombinations(index + 1, k, remSum + index, result, n, list);
        list.remove(list.size() - 1);
        generateCombinations(index + 1, k, remSum, result, n, list);

    }

    public static void main(String args[]) {
        System.out.println(combine(45, 9));
    }

}
