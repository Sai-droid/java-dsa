import java.util.ArrayList;
import java.util.Scanner;

class MazeProblem {
    public static boolean isSafe(int i, int j, int n) {
        if (i < n && j < n && i >= 0 && j >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    arr[i][j] = sc.nextInt();

                }

            }

            ArrayList<String> ans = new ArrayList<>();

            String s = " ";

            int[][] vis = new int[n][n];

            pp(arr, n - 1, n - 1, n, ans, vis, s);

            for (int k = 0; k < ans.size(); k++) {

                System.out.print(ans.get(k) + " ");

            }

            System.out.println();

            t = t - 1;

        }

    }

    static void pp(int[][] nums, int i, int j, int n, ArrayList<String> ans, int[][] vis, String s) {
        if (i < 0 || j < 0 || i >= n || j >= n) {
            return;
        }
        if (nums[i][j] == 0)
            return;

        if (i == j && j == 0 && nums[i][j] == 1) {

            // System.out.println(s);

            ans.add(s);

            return;
        }
        int visted[][] = new int[n][n];
        visted[i][j] = 1;
        if (isSafe(i + 1, j, n) && visted[i + 1][j] != 1) {
            pp(nums, i + 1, j, n, ans, vis, s + 'D');

        }
        if (isSafe(i, j + 1, n) && visted[i][j + 1] != 1) {
            pp(nums, i, j + 1, n, ans, vis, s + 'R');

        }
        if (isSafe(i - 1, j, n) && visted[i - 1][j] != 1) {
            pp(nums, i - 1, j, n, ans, vis, s + 'U');

        }
        if (isSafe(i, j + 1, n) && visted[i + 1][j] != 1) {
            pp(nums, i, j + 1, n, ans, vis, s + 'L');

        }
        visted[i][j] = 0;

    }

}

// 2 4 1 0 0 0 1 1 0 1 0 1 0 0 0 1 1 1 4 1 0 0 0 1 1 0 1 1 1 0 0 0 1 1 1