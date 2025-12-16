import java.util.Scanner;

class KPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size (odd >=3) [default 7]: ");
		int n;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		} else {
			n = 7;
		}
		if (n < 3) n = 3;

		int k = n;
		int mid = (k - 1) / 2;

		for (int i = 0; i < k; i++) {
			int rightCol = (i <= mid) ? (k - 1 - i) : i;
			for (int c = 0; c < k; c++) {
				if (c == 0 || c == rightCol) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}
}