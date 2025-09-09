public class PatternProgram {
    public static void main(String[] args) {
        int n = 5;

        // Increasing part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Decreasing part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
