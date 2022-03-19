import java.util.Arrays;

class LonPrefix{
    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        System.out.println(first.charAt(c)+" "+ c);
        return c == 0 ? "" : first.substring(0, c);
    }

    public static void main(String args[]){
        String strss[] = {"abcd","abc","acde"};
        System.out.println(longestCommonPrefix(strss));
    }
}