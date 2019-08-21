import java.util.*;

public class IsUnique {

    // HashMap Version
    //  Time: O(n)
    //  Space: O(n)
    public static boolean isUnique(String str) {
        if (str == null) return false;
        if (str.length() == 0) return false;

        // Structure to hold chars with their corresponding counts
        HashMap<Character, Integer> charWithCounts = new HashMap<Character, Integer>();

        // Populate map
        for (char c : str.toCharArray()) {
            if (!charWithCounts.containsKey(c)) {
                charWithCounts.put(c, 1);
            } else {
                charWithCounts.put(c, charWithCounts.get(c) + 1);
            }
        }

        // Check for duplicates
        for (char c : str.toCharArray()) {
            if (charWithCounts.get(c) > 1) {
                return false;
            }
        }

        return true;
    }
    public static void main (String[] args) {
        String uniqueStr1 = "abcdef";
        String notUniqueStr1 = "aabbccddeeff";
        String uniqueStr2 = "catsdog";

        System.out.println(isUnique(notUniqueStr1));
    }
}