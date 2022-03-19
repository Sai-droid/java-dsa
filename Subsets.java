import java.util.Arrays;
class Subsets {
          
      public static void Listttt(int[] nums) {
        
        
    static void AllSubsets(int set[]) {
        int n = set.length;
      
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(" "+set[j]+" ");
                }
            }
            System.out.print("} ");
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int set[] = { 5, 15, 3 
        };
       int maximum =  Math.max(1,2);
        Arrays.sort(set);
        AllSubsets(set);
    }
}