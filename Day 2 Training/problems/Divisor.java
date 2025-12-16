public class Divisor {
    
    // Method to find all divisors of a number
    public static void findDivisors(int number) {
        System.out.println("Divisors of " + number + ": ");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    // Efficient method to find divisors (optimized)
    public static void findDivisorsOptimized(int number) {
        System.out.println("Divisors of " + number + " (optimized): ");
        
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                if (i != number / i) {  // Avoid printing the same divisor twice
                    System.out.print(number / i + " ");
                }
            }
        }
        System.out.println();
    }
    
    // Method to count the number of divisors
    public static int countDivisors(int number) {
        int count = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        int num = 28;
        
        findDivisors(num);
        findDivisorsOptimized(num);
        System.out.println("Total divisors: " + countDivisors(num));
        
        System.out.println();
        
        // Test with other numbers
        num = 36;
        findDivisors(num);
        findDivisorsOptimized(num);
        System.out.println("Total divisors: " + countDivisors(num));
        
        System.out.println();
        
        num = 12;
        findDivisors(num);
        findDivisorsOptimized(num);
        System.out.println("Total divisors: " + countDivisors(num));
    }
}
