package codingtest;

public class ArrayOutput {

	static int cnt_neg;

	static boolean exists_zero;

	static void preProcess(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0)
				cnt_neg++;
			if (arr[i] == 0)
				exists_zero = true;
		}
	}

	static boolean isPossible(int k) {
		if (!exists_zero) {
			if (k >= cnt_neg && (k - cnt_neg) % 2 == 0)
				return true;
			else
				return false;
		} else {
			if (k >= cnt_neg)
				return true;
			else
				return false;
		}
	}

	public static void main(String[] args) {
		int myArray[][] = { { 2 }, { 3, 2 }, { 4 }, { 3, 8, 13, 11 } };
		for (int[] temp : myArray) {

			preProcess(temp, temp.length);

			int queries[] = { 3, 8 };
			int q = temp.length;

			for (int i = 0; i < q; i++) {
				if (isPossible(queries[i]))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
}