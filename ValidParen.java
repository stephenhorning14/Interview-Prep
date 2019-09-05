public class ValidParen {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Map<Character, Character> closeOpenPairs = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> processedChars = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (closeOpenPairs.containsKey(c)) {
                char topEle = processedChars.empty() ? '$' : processedChars.pop();
                if (topEle != closeOpenPairs.get(c)) {
                    return false;
                }
            } else {
                processedChars.push(c);
            }
        }
        return processedChars.isEmpty();
    }

    public static void main(String[] args) {

    }
}