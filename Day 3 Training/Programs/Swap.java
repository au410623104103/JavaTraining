import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
       int a = 20, b = 30;
       System.out.println(a + " " + b);

       int temp = a;
         a = b; 
            b = temp;  
         System.out.println(a + " " + b);

         a=a+b;
         b=a-b;
            a=a-b;
            System.out.println(a + " " + b);
         a = a * b;
            b = a / b;  
            a = a / b;
         System.out.println(a + " " + b);   
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();
            System.out.println("Before swapping: " + a + " " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swapping: " + a + " " + b);
        sc.close();
    }
}
