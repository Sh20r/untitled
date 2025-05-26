public class ParenthesisCounter {
    public static int countWellFormedParenthesis(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("count of pairs cant be negative");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * (4 * i - 2) / (i + 1);
        }
        return result;
    }
}
