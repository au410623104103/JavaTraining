	
	public class MoveAll0toEnd {
		/**
		 * Moves all zeros in the array to the right end, preserving order of
		 * non-zero elements. This is done in-place in O(n) time and O(1) extra space.
		 */
		public static void moveZerosToEnd(int[] arr) {
			if (arr == null || arr.length == 0) return;
			int pos = 0; // position to place next non-zero
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					arr[pos++] = arr[i];
				}
			}
			while (pos < arr.length) {
				arr[pos++] = 0;
			}
		}

		private static String toString(int[] arr) {
			if (arr == null) return "null";
			if (arr.length == 0) return "[]";
			StringBuilder sb = new StringBuilder();
			sb.append('[');
			for (int i = 0; i < arr.length; i++) {
				if (i > 0) sb.append(", ");
				sb.append(arr[i]);
			}
			sb.append(']');
			return sb.toString();
		}

		public static void main(String[] args) {
			int[][] tests = {
				{0, 1, 0, 3, 12},
				{1, 2, 3, 0, 0},
				{0, 0, 0},
				{},
				{0, 1, 2, 0, 3, 0, 4}
			};

			for (int[] t : tests) {
				System.out.println("Before: " + toString(t));
				moveZerosToEnd(t);
				System.out.println(" After: " + toString(t));
				System.out.println();
			}
		}
	}
