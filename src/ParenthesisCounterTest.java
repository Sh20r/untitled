public class ParenthesisCounterTest {
    public static void main(String[] args) {
        testBasicCases();
        testPerformance();
    }

    private static void testBasicCases() {
        System.out.println("=== Базовые тесты ===");
        checkTest(1, 1, "1 par");
        checkTest(2, 2, "2 par");
        checkTest(3, 5, "3 par");
    }

    private static void testPerformance() {
        System.out.println("\n=== tests ===");
        long startTime = System.nanoTime();
        int result = ParenthesisCounter.countWellFormedParenthesis(15);
        long duration = (System.nanoTime() - startTime) / 1000;

        System.out.printf("Result for n=15: %,d (time: %d )%n", result, duration);
    }

    private static void checkTest(int input, int expected, String testName) {
        int actual = ParenthesisCounter.countWellFormedParenthesis(input);
        if (actual == expected) {
            System.out.printf("%s: ok (awaid %,d, return %,d)%n", testName, expected, actual);
        } else {
            System.out.printf("%s: exception (awaid %,d, return %,d)%n", testName, expected, actual);
        }
    }
}