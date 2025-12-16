public class Count {
    
    public static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number); 
        
        if (number == 0) {
            return 1;
        }
        
        while (number > 0) {
            count++;
            number /= 10;  
        }
        
        return count;
    }
    
    
    public static int countDigitsUsingString(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + countDigits(num));
        
        System.out.println("\nNumber: 9876");
        System.out.println("Count of digits: " + countDigits(9876));
        
        System.out.println("\nNumber: 100");
        System.out.println("Count of digits: " + countDigits(100));
        
        System.out.println("\nNumber: 0");
        System.out.println("Count of digits: " + countDigits(0));
        
        System.out.println("\n--- Using String method ---");
        System.out.println("Number: 12345");
        System.out.println("Count of digits: " + countDigitsUsingString(12345));
    }
}
