//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int n = 0; n <= 5; n++) {
            int count = ParenthesisCounter.countWellFormedParenthesis(n);
            System.out.printf("For %d pair: %d count%n", n, count);
        }


        int n = 15;
        System.out.printf("%nFor %d pairs: %,d count%n",
                n, ParenthesisCounter.countWellFormedParenthesis(n));


        try {
            System.out.println("\ntry with negative:");
            ParenthesisCounter.countWellFormedParenthesis(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
}