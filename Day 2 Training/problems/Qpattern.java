public class Qpattern {
    public static void main(String[] args) {
        int n = 5; // Size of the Q pattern
        
        // Print Q pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Top and bottom horizontal lines
                if ((i == 0 && j < n - 1) || (i == n - 1 && j < n - 1)) {
                    System.out.print("* ");
                }
                // Left vertical line
                else if (j == 0) {
                    System.out.print("* ");
                }
                // Right vertical line (except last row)
                else if (j == n - 1 && i < n - 1) {
                    System.out.print("* ");
                }
                // Tail of Q (diagonal at bottom right)
                else if (i >= n - 2 && j == n - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
