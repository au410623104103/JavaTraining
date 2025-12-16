import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number to print table for: ");
		while (!sc.hasNextInt()) {
			System.out.println("Please enter a valid integer.");
			sc.next();
			System.out.print("Enter number to print table for: ");
		}
		int n = sc.nextInt();

		System.out.print("Enter limit (how many multiples to print, default 10): ");
		int limit = 10;
		if (sc.hasNext()) {
			String token = sc.next();
			try {
				limit = Integer.parseInt(token);
			} catch (NumberFormatException e) {
				// keep default
			}
		}

		System.out.println("\nMultiplication table of " + n + ":");
		for (int i = 1; i <= limit; i++) {
			System.out.printf("%d x %d = %d%n", n, i, n * i);
		}

		sc.close();
	}
}
