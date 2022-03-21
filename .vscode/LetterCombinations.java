import java.util.*;

class letterCombinations {

    public static List<String> letterCombinations(String digits) {

        List<String> digitMaps = new ArrayList<>();

        digitMaps.add("abc");

        digitMaps.add("def");

        digitMaps.add("ghi");

        digitMaps.add("jkl");

        digitMaps.add("mno");

        digitMaps.add("pqrs");

        digitMaps.add("tuv");

        digitMaps.add("wxyz");

        char[] temp = new char[digits.length()];

        int i = 0;

        List<String> ans = new ArrayList<>();

        printAllcombs(temp, i, digits, digitMaps, ans);
        
        return ans;

    }

    public static void printAllcombs(char[] temp, int i, String digits, List<String> digitMaps, List<String> ans) {

        if (digits.length() == 0) {

            return;

        }

        if (i == digits.length()) {
        
            ans.add(String.valueOf(temp));

           
            return;
        }

        int n = digits.charAt(i) - '2';

        String m = digitMaps.get(n);

        for (int j = 0; j < m.length(); j++) {

            temp[i] = m.charAt(j);

            printAllcombs(temp, i + 1, digits, digitMaps, ans);

        }

    }

    public static void main(String args[]) {
        letterCombinations("23");
    }

}