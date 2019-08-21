import java.util.*;

public class Anagram {
    static int NUM_OF_TOTAL_CHARS = 256;

    public static boolean isAnagram(String input1, String input2) {
        if ( (input1 == null || input2 == null) || (input1.length() != input2.length()) )
            return false;

        int n = input1.length();
        int count1[] = new int[NUM_OF_TOTAL_CHARS];
        int count2[] = new int[NUM_OF_TOTAL_CHARS];
        Arrays.fill(count1, 0);
        Arrays.fill(count2, 0);

        for (int i = 0; i < n; i++) {
            count1[input1.charAt(i)]++;
            count2[input2.charAt(i)]++;
        }

        for (int i = 0; i < NUM_OF_TOTAL_CHARS; i++) {
            if (count1[i] != count2[i])
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        String input1 = "abc";
        String input2 = "cba";

        System.out.println("Is " + input1 + " the same as " + input2 + ": " + isAnagram(input1, input2));
    }
}