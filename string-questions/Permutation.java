import java.util.*;

public class Permutation {

    public static boolean permutation(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;
        if (str1.length() != str2.length())
            return false;

        Map<Character, Integer> str1CharCounts = new HashMap<Character, Integer>();
        Map<Character, Integer> str2CharCounts = new HashMap<Character, Integer>();

        for (char c : str1.toCharArray()) {
            if (str1CharCounts.containsKey(c)) {
                str1CharCounts.put(c, str1CharCounts.get(c) + 1);
            } else {
                str1CharCounts.put(c, 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (str2CharCounts.containsKey(c)) {
                str2CharCounts.put(c, str2CharCounts.get(c) + 1);
            } else {
                str2CharCounts.put(c, 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (str1CharCounts.get(c) != str2CharCounts.get(c)) {
                return false;
            }
        }
       
        return true;
    }

    public static void main(String args[]) {
        String str1 = "firecode";
        String str2 = "codefire";

        System.out.println(permutation(str1, str2));
    }
}