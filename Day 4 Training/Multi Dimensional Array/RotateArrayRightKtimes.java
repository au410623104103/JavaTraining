import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayRightKtimes {

	// Rotates array arr to the right by k positions (in-place) using reversal algorithm
	public static void rotateRight(int[] arr, int k) {
		if (arr == null || arr.length == 0) return;
		int n = arr.length;
		k = ((k % n) + n) % n; // handle negative and large k
		if (k == 0) return;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

	private static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Array size must be positive.");
			sc.close();
			return;
		}
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		System.out.print("Enter k (number of right rotations): ");
		int k = sc.nextInt();
		sc.close();

		System.out.println("Original: " + Arrays.toString(arr));
		rotateRight(arr, k);
		System.out.println("After rotating right by " + k + ": " + Arrays.toString(arr));
	}
}
