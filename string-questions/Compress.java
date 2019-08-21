import java.util.*;

public class Compress {

    public static String compressString(String text) {
        if (text == null) return null;
        if (text.length() <= 1) return text;
        
        StringBuilder compressed = new StringBuilder();
        
        HashMap<Character, Integer> lettersWithCounts = new HashMap();
        char tmp;
        int val;
        for (int i = 0; i < text.length(); i++) {
            tmp = text.charAt(i);
            if (lettersWithCounts.get(tmp) == null) {
                lettersWithCounts.put(tmp, 1);
            } else {
                val = lettersWithCounts.get(tmp);
                val++;
                lettersWithCounts.remove(tmp);
                lettersWithCounts.put(tmp, val);
            }
        }
        
        for (int i = 0; i < text.length(); i++) {
            tmp = text.charAt(i);
            val = lettersWithCounts.get(tmp);
            if (compressed.indexOf("" + tmp) == -1) {
                compressed.append("" + tmp);
                if (val > 1) {
                    compressed.append("" + val);
                }
            }
        }
        
        return compressed.toString();
    }
    public static void main(String args[]) {
        String text = "abc";
        String text1 = "aaabbbccc";
        String text2 = "abbbbcccc";

        String compressed = compressString(text2);

        System.out.println("Original: " + text2 + " Compressed: " + compressed);
    }
}