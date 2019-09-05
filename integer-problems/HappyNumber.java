import java.util.*;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        while (inLoop.add(n)) {
            if (n == 1) {
                return true;
            } else {
                n = getSquaredSum(n);
            }
        }
        return false;
    }

    public static int getSquaredSum(int n) {
        int squaredSum = 0;
        int digit = 0;
        while (n != 0) {
            digit = n % 10;
            squaredSum += (digit * digit);
            n /= 10;
        }
        return squaredSum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}