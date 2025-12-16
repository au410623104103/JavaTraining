import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int inputYear = sc.nextInt();
        
        if (isLeapYear(inputYear)) {
            System.out.println(inputYear + " is a leap year");
        } else {
            System.out.println(inputYear + " is not a leap year");
        }
        
        sc.close();
    }
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if:
        // 1. It is divisible by 4 AND
        // 2. If it is divisible by 100, it must also be divisible by 400
        
        if (year % 400 == 0) {
            return true;  // Divisible by 400 - leap year
        } else if (year % 100 == 0) {
            return false;  // Divisible by 100 but not 400 - not a leap year
        } else if (year % 4 == 0) {
            return true;  // Divisible by 4 - leap year
        } else {
            return false;  // Not divisible by 4 - not a leap year
        }
    }
}