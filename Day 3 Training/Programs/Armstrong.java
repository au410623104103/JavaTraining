import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		if (!sc.hasNextLong()) {
			System.out.println("Invalid input. Please enter an integer.");
			sc.close();
			return;
		}

		long number = sc.nextLong();
		sc.close();

		long original = Math.abs(number);
		int digits = String.valueOf(original).length();
		long temp = original;
		long sum = 0;

		while (temp > 0) {
			int d = (int) (temp % 10);
			sum += pow(d, digits);
			temp /= 10;
		}

		if (sum == original) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is NOT an Armstrong number.");
		}
	}

	private static long pow(int base, int exp) {
		long r = 1;
		for (int i = 0; i < exp; i++) r *= base;
		return r;
	}
}
