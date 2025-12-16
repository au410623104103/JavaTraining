public class Digits {
    
    // Method to find the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Handle negative numbers
        
        while (number > 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;         // Remove the last digit
        }
        
        return sum;
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sumOfDigits(num));
        
        // Test with other numbers
        System.out.println("\nNumber: 9876");
        System.out.println("Sum of digits: " + sumOfDigits(9876));
        
        System.out.println("\nNumber: 246789");
        System.out.println("Sum of digits: " + sumOfDigits(246789));
    }
}
