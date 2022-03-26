import java.util.ArrayList;
import java.util.List;

class sequentialDigits {
    public static boolean check(int n){
       int temp =n%10 ;
       int temp1 =0;
        n=n/10;
        while(n>0){
            temp1 = n%10;
            n=n/10;
            if(temp-1 != temp1){
                return false;
            }
            temp = temp1;
            
        }
       
        return true;
    }
    public static List<Integer> sequentialdigits1(int low, int high) {
        String seqNum = "123456789";
         List<Integer> list = new ArrayList<>();

        int minWindow = String.valueOf(low).length();
        int maxWindow = String.valueOf(high).length();
        for(;minWindow <= maxWindow; minWindow++){
            for(int j = 0; j + minWindow <= 9; j++){
                String str = seqNum.substring(j, j + minWindow);
                int num = Integer.parseInt(str);
                if(num > high) break;
                if(low <= num && high >= num){
                    list.add(num);
                }
            }
        }
        return list;
    }
    public static List<Integer> sequentialdigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for(int i = low;i<=high;i++){
            if(check(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String args[]){
        // System.out.println(sequentialdigits(100,300));
        System.out.println(sequentialdigits1(100,300));
    }
}