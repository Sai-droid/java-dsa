import java.util.*;

class anagagam {
    static boolean anagram(String one, String two) {
        int result1 = 0;
        int result2 = 0;
        if (one.length() != two.length()) {
            return false;
        }
        for (int i = 0; i < one.length(); i++) {
            result1 = result1 + (int) one.charAt(i);
        }
        for (int i = 0; i < two.length(); i++) {
            result2 = result2 + (int) two.charAt(i);
        }
        System.out.println(result1 + " " + result2);
        if (result1 == result2) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        // System.out.println(anagram("ca", "ac"));
        String str = "GeeksForGeeks";
  
        
        String[] ch = str.split("");
        Set<String> hs = new HashSet<String>();
        Collections.addAll(hs, ch); 
        System.out.println(hs);
    }
}